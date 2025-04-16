package com.springCore.springExpreLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExpLangTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springCore/springExpreLang/springExpLang.xml");
		SpringExpDemo test1 = (SpringExpDemo) context.getBean("springExpDemo", SpringExpDemo.class);
		System.out.println(test1.toString());
	}
}
