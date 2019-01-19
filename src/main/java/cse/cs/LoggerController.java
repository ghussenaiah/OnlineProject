package com.javatpoint;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
@RestController
public class LoggerController {
	@RequestMapping("/logger")
	public void configurationLevel(@RequestParam("configurationLevel") String configurationLevel) throws Exception {
		Logger logger = LogManager.getLogger("com.bcv.kagami");
		//adding restriction for only to get logs of com.bcv.kagami
		Logger logger1 = LogManager.getRootLogger();
		if(configurationLevel.equals("info")){
			Configurator.setLevel(logger.getName(), Level.INFO);
			Configurator.setLevel(logger1.getName(), Level.INFO);
		}else if(configurationLevel.equals("off")){
			Configurator.setLevel(logger.getName(), Level.OFF);
			Configurator.setLevel(logger1.getName(), Level.OFF);
		}
		else if(configurationLevel.equals("error")){
			Configurator.setLevel(logger.getName(), Level.ERROR);
			Configurator.setLevel(logger1.getName(), Level.ERROR);
		}
		else if(configurationLevel.equals("debug")){
			Configurator.setLevel(logger.getName(), Level.DEBUG);
			Configurator.setLevel(logger1.getName(), Level.DEBUG);
		}
	}
}
