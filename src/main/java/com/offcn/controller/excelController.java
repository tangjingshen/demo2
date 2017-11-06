package com.offcn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.utils.ExcelUtils;

@Controller
public class excelController {

	@Resource
	ExcelUtils excelUtils;
	@RequestMapping("/exceltodatabase")
	public String datatobase(){
		excelUtils.getExcelToSqlbase();
		return "index";
	}
}
