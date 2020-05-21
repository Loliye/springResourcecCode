package com.mikufans;

import com.mikufans.bean.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mikufans")
public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Test.class);
		Cat bean = applicationContext.getBean(Cat.class);
		System.out.println(bean);
	}
}
