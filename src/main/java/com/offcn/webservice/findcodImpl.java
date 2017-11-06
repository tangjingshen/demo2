package com.offcn.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.dao.MobilenumMapper;
import com.offcn.po.Mobilenum;
@WebService
@Service
public class findcodImpl implements findcod{

	
	@Resource
	MobilenumMapper mobilenumMapper;
	@Override
	public String findcode(String num) {
		Mobilenum m = mobilenumMapper.selectByMobileNumber(num);
		return m.toString();
	}

	
}
