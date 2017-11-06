package com.offcn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.utils.ExcelUtils;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("111µÄdanger");
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		ExcelUtils s = (ExcelUtils) context.getBean("excelUtils");
	s.getExcelToSqlbase();
	}

}
