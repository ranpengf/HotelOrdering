package com.dao;

import com.bean.Reviews;
import com.bean.ReviewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewsMapper {
    long countByExample(ReviewsExample example);

    int deleteByExample(ReviewsExample example);

    int insert(Reviews record);

    int insertSelective(Reviews record);

    List<Reviews> selectByExample(ReviewsExample example);

    int updateByExampleSelective(@Param("record") Reviews record, @Param("example") ReviewsExample example);

    int updateByExample(@Param("record") Reviews record, @Param("example") ReviewsExample example);
}