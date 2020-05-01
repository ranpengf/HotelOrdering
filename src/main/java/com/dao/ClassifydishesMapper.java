package com.dao;

import com.bean.Classifydishes;
import com.bean.ClassifydishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifydishesMapper {
    long countByExample(ClassifydishesExample example);

    int deleteByExample(ClassifydishesExample example);

    int insert(Classifydishes record);

    int insertSelective(Classifydishes record);

    List<Classifydishes> selectByExample(ClassifydishesExample example);

    int updateByExampleSelective(@Param("record") Classifydishes record, @Param("example") ClassifydishesExample example);

    int updateByExample(@Param("record") Classifydishes record, @Param("example") ClassifydishesExample example);
}