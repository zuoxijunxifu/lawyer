package com.example.laywer.dao;

import com.example.laywer.pojo.Lawer;
import com.example.laywer.pojo.SearchCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Mapper
public interface LawyerMapper {
    //根据区域和案件类型查询律师 按照综合排序来排列
    List<Lawer> searchLawer(SearchCondition condition);
}
