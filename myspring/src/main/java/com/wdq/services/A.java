package com.wdq.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: wdq
 * @Date: 2020/7/19 21:19
 * @Description:
 */
@Component
public class A {
	@Autowired
	B b;

	public A() {
		System.out.println("create B");
	}
}
