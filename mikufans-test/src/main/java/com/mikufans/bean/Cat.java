package com.mikufans.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Cat
{
	@Value("@value")
	private String name = "name";

	@Override
	public String toString()
	{
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
