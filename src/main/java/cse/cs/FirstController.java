package cse.cs;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstController {
   
  
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView sayHello(HttpServletRequest request, HttpServletResponse response) {
	   System.out.println("am in testing");
      return new ModelAndView("index");
    }
}
