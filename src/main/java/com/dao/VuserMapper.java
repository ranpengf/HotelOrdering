package com.dao;

import com.bean.Vuser;
import com.bean.VuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VuserMapper {
    long countByExample(VuserExample example);

    int deleteByExample(VuserExample example);

    int insert(Vuser record);

    int insertSelective(Vuser record);

    List<Vuser> selectByExample(VuserExample example);

    int updateByExampleSelective(@Param("record") Vuser record, @Param("example") VuserExample example);

    int updateByExample(@Param("record") Vuser record, @Param("example") VuserExample example);
}