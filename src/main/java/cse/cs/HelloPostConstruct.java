package com.javatpoint;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
/*import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;*/
@Service
public class HelloPostConstruct {

	
	@PostConstruct
	private void posttest()
	{
		System.out.println("Hello @PostConstruct");
	}
}
