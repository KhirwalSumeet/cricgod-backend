package com.application.cricgod.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:response.properties")
public class CustomJsonUtil {
	
	private String code;
	private String message;
	private Object data;
	@Autowired
	private Environment envProperties;
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public void setParams(Object data, String response) {
		this.setData(data);
		this.setCode(envProperties.getProperty(response+".code"));
		this.setMessage(envProperties.getProperty(response+".message"));
	}
	
}
