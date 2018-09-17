package com.mohit.spring.basics.springin5steps.scope;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mohit.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.mohit.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	  private static Logger LOGGER = 
			  LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
		public static void main(String[] args) {
			
			//ApplicationContext manages all the beans
			//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgo());
			ApplicationContext applicationContext = 
					SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			PersonDAO personDAO1 = 
					applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDAO2 = 
					applicationContext.getBean(PersonDAO.class);
			LOGGER.info("{}",personDAO1);
			LOGGER.info("{}",personDAO1.getJdbcConnection());
			
			LOGGER.info("{}",personDAO2);
			LOGGER.info("{}",personDAO2.getJdbcConnection());
			
		}

}

