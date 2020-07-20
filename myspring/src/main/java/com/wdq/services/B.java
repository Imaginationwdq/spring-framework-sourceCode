package com.wdq.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: wdq
 * @Date: 2020/7/19 21:20
 * @Description:
 */
@Component
public class B {

	@Autowired
	A a;

	public B() {
		System.out.println("create B");
	}
}
