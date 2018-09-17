package com.mohit.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS) //It doesnot make different 
													//instances of JdbcConnection as it is used in PersonDao
public class JdbcConnection {

	public JdbcConnection() {
		//super();
		System.out.println("JDBC connection");
	}
	
}
