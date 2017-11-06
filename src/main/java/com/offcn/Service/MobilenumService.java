package com.offcn.Service;

import com.offcn.po.Mobilenum;

public interface MobilenumService {

	int insert(Mobilenum record);
	Mobilenum selectByMobileNumber(String MobileNumber);
}
