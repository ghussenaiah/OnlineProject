package com.test.codestyle;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*import com.bcv.kagami.core.utils.constants.ClassConstants;*/

/*import org.json.simple.JSONObject;
import org.springframework.web.client.RestTemplate;

import com.bcv.kagami.core.utils.constants.DeploymentConstants;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;*/

/*import com.bcv.kagami.core.utils.constants.RuntimeGenerationConstants;
import com.bcv.kagami.core.validations.exception.app.ApplicationSQLException;*/

/*import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.jpa.QueryHints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;*/

//import lombok.ToString;

public interface CodeStyle {}
	/*	
	@Autowired
	@Getter
	@Setter
	ContextController contextController;
	ProcessIdentifier processIdentifier = getContextUtils().createProcessIdentifier(pid);
	*/
	//-------------------------------------------------------------------------------
	
    /*	
	processIdentifier.setGUID(String.valueOf(UUID.randomUUID()));*/
	//-------------------------------------------------------------------------------
	
	
	//---------------------------------------------------------------------------
	//NewThinngs Need to Know
	//----------------------------------------------------------------------------
	
	/*
     @ToString   @Override   @Transactional(value = "mainTransactionManager", propagation = Propagation.REQUIRES_NEW) */
	//--------------------------------------------------------------------------------
	//once we set object data we can get unique key using all attributes of object
	
	/*public String getUniqueProcessIdentifier() {
		return authToken.hashCode() + "-" +
				browserId.hashCode() + "-" + 
				GUID.hashCode();
	
	}*/
	//using Environment class we can read application.proerties value
	/*@Autowired
	Environment environment;
	String value=environment.getProperty(identifier);
	
	*/
	//using Entitymanger class we can save db object fetch list of object
/*	@Autowired(required = false)
	private EntityManager entityManager;
	
	@Transactional(value = "mainTransactionManager", propagation = Propagation.REQUIRES_NEW)
	@Override
	public List<Object> getListFromQuery(String query, Map<String, Object> parameterMap, Integer offSet,
			Integer maxResults) {
		Query q = entityManager.createQuery(query);
		if (parameterMap != null) {
			for (String key : parameterMap.keySet()) {
				q.setParameter(key, parameterMap.get(key));
			}
		}
		if (offSet != null && offSet != 0)
			q.setFirstResult(offSet);
		if (maxResults != null && maxResults != 0) {
			q.setMaxResults(maxResults);
		}
		//might be cause of slowness after merge commenting for some time
		q.setHint(QueryHints.HINT_FETCH_SIZE, Integer.MIN_VALUE);
		List<Object> object =q.getResultList();
		entityManager.clear();
		return object;
	}
	/*
	  EntityManager will have methods
	  // 1 createQuery
	 */
	
	
	/*
	 way of quaries we can pass
	 String query = new StringBuilder()
				.append("from SystemUser where domain='").append(domain)
				.append("'").toString(); 
				sytemUSerList = genericDao.getListFromQuery(" from SystemUser", null, null, null, null, null, null);
	 * 
	 */
    //catch block format
	/*catch (Exception ex) {
		String err = String.format("failed fetching users for role: %s", domain);
		log.error(err, ex);
		throw new ApplicationSQLException(ex);

	}*/
    // get details from basic object by mapping with known object
	/*Object user = users.get(0);
	Class<?> clazz = user.getClass();
	Method method = clazz.getMethod(RuntimeGenerationConstants.METHOD_NAME_USER_ID);
	userId = (String) method.invoke(user);
	Method method1 = clazz.getMethod(RuntimeGenerationConstants.METHOD_NAME_USER_PASSWORD);
	password = (String) method1.invoke(user);
	Method method2 = clazz.getMethod(RuntimeGenerationConstants.METHOD_NAME_USER_DOMAIN);
	domain = (String) method2.invoke(user);
	*/
   //calling rest call from java instead of ui using RestTemplate
	/*JSONObject request
	 * request.put("username", userId);
	request.put("userId", userId);
	request.put("password", password);
	request.put("userDomain",domain);
	String url = getPropertyValueProvider().getValue(DeploymentConstants.AUTH_COMPONENT);
	RestTemplate restTemplate = new RestTemplate();
	String restponse = restTemplate.postForObject(url+"/KagamiAuthService/auth/auth/login", request, String.class);
	JsonNode jsonResp = new ObjectMapper().readTree(restponse);
			if(jsonResp.get("token")!=null)
			{
			token = jsonResp.get("token").asText();
			}
	*/

	/*Object obj = entityUtils.getEntityClassFromEntityId(ClassConstants.USER).newInstance();*/




