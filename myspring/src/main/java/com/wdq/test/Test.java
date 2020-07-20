package com.wdq.test;

import com.wdq.app.Appconfig;
import com.wdq.services.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: wdq
 * @Date: 2020/7/19 21:27
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(A.class));
	}
}
