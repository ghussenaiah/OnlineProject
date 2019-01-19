package com.javatpoint;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class AuthFilter extends GenericFilterBean {
	@Value(value = "${auth.uri}")
	private String authUri;
	@Value(value = "${auth.uri.valid}")
	private String validationUri;

	@Value(value = "${auth.uri.page}")
	private String signinPage;

	private static final String EMPTY = "";
	private static final String AUTHORIZATION_PARAM = "Authorization";
	private static final String QUESTION_MARK = "?";
	private static final String TOKEN_PARAM = "token";
	private static final String EQUALS = "=";
	private static Pattern excludeUrls = Pattern
			.compile("^.*/(css|js|images|bower_components|assets|auth|html|scripts)/.*$", Pattern.CASE_INSENSITIVE);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String stringToken = null;
		try {
			Cookie[] cookies = req.getCookies();
			if (null != cookies && cookies.length > 0) {
				for (Cookie cookie : cookies) {
					if ("token".equals(cookie.getName())) {
						stringToken = cookie.getValue();
						break;
					}
				}
			}
			if (!isExcluded(req)) {
				if (null != stringToken && !EMPTY.equalsIgnoreCase(stringToken)) {
					// log.trace("the token is in for validation");
					validateTheToken(req, res, stringToken);
				} else {
					// log.trace("the user is not yet validated--chaining
					// request to authenticate the user");
					redirectToLoginPage(req, res);
				}

			}
			chain.doFilter(request, response);
		} catch (Exception e) {
			// log.error("there was an issue while executing the filter",e);
		}

		// chain.doFilter(request, response);

	}

	private void redirectToLoginPage(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.sendRedirect(signinPage);
		} catch (IOException e) {
			// log.error("there was an issue while redirecting",e);
		}
	}

	private boolean isExcluded(HttpServletRequest request) {
		String url = request.getRequestURL().toString();
		// log.trace(url);
		Matcher m = excludeUrls.matcher(url);
		if (url.contains("signin") || url.contains("assets") || "/".equals(request.getRequestURI()))
			return true;
		return m.matches();
	}

	private void validateTheToken(HttpServletRequest req, HttpServletResponse res, String stringToken)
			throws IOException {
		// log.trace("will validate and come back,See You Soon,!!");
		String param = stringToken;
		String urlParameters = QUESTION_MARK.concat(TOKEN_PARAM).concat(EQUALS.concat(param));
		RestTemplate restTemplate = new RestTemplate();
		boolean isValid = restTemplate.getForObject(validationUri.concat(urlParameters), Boolean.class);
		if (!isValid) {
			// log.trace("OOOPSSS! the token is Invalid :@ i suspect You");
			redirectToLoginPage(req, res);
		} else {
			// log.trace("hey i am done with validation dude..u seem to be
			// ok!");
		}
	}

	

}
