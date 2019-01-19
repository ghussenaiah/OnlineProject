package com.javatpoint;


 
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.stereotype.Controller;  
@Controller  
public class HomeController {  
    @RequestMapping("/home")  
    public String index(){  

    	System.out.println("Hello am working");
    	return"index";  
    	
    	//System.out.println("Hello am working");
    } 
}
