package com.offcn.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.offcn.dao.MobilenumMapper;
import com.offcn.po.Mobilenum;
@Service
public class MobilenumServiceImpl implements MobilenumService {

	@Resource
	MobilenumMapper mobilenumMapper;
	@Override
	public int insert(Mobilenum record) {
		// TODO Auto-generated method stub
		int i = mobilenumMapper.insert(record);
		return i;
	}

	@Override
	public Mobilenum selectByMobileNumber(String MobileNumber) {
		// TODO Auto-generated method stub
		Mobilenum mobilenum = mobilenumMapper.selectByMobileNumber(MobileNumber);
		return mobilenum;
	}

}
