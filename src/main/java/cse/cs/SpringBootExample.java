package com.javatpoint;  
  
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



  
@SpringBootApplication 
@ComponentScan({ "com.javatpoint" })
public class SpringBootExample {  
	
	@Autowired
	private LoggerController loggerController;
	
    public  static void main(String[] args) {  
        SpringApplication.run(SpringBootExample.class, args);  
        
    }
    @PostConstruct
	private void init() throws Exception {
		
		loggerController.configurationLevel("error");
	}

    
}