package com.springCore.WithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springCore.WithoutXML")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();

	}

	@Bean(name = { "name", "temp1", "temp2" })
	public Student getStudent() {
		Student st = new Student(getSamosa());
		return st;
	}
}
