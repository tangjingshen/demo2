package com.offcn.dao;

import com.offcn.po.Mobilenum;
import com.offcn.po.MobilenumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobilenumMapper {
    int countByExample(MobilenumExample example);

    int deleteByExample(MobilenumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mobilenum record);

    int insertSelective(Mobilenum record);

    List<Mobilenum> selectByExample(MobilenumExample example);

    Mobilenum selectByPrimaryKey(Integer id);
    
    Mobilenum selectByMobileNumber(String MobileNumber);

    int updateByExampleSelective(@Param("record") Mobilenum record, @Param("example") MobilenumExample example);

    int updateByExample(@Param("record") Mobilenum record, @Param("example") MobilenumExample example);

    int updateByPrimaryKeySelective(Mobilenum record);

    int updateByPrimaryKey(Mobilenum record);
}