package com.springCore.WithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	//	Student st = (Student) context.getBean("studentBean", Student.class);
		Student st = (Student) context.getBean("temp2", Student.class);
		st.studying();
	}
}
