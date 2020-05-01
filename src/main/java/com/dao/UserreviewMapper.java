package com.dao;

import com.bean.Userreview;
import com.bean.UserreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserreviewMapper {
    long countByExample(UserreviewExample example);

    int deleteByExample(UserreviewExample example);

    int insert(Userreview record);

    int insertSelective(Userreview record);

    List<Userreview> selectByExample(UserreviewExample example);

    int updateByExampleSelective(@Param("record") Userreview record, @Param("example") UserreviewExample example);

    int updateByExample(@Param("record") Userreview record, @Param("example") UserreviewExample example);
}