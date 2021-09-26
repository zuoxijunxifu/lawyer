package com.example.laywer.controller;

import com.example.laywer.dao.LawyerMapper;
import com.example.laywer.pojo.Lawer;
import com.example.laywer.pojo.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LawyerController {
    @Autowired
    LawyerMapper lawyerMapper;
    @RequestMapping("/search")
    @ResponseBody
    public List<Lawer> searchLawyers(SearchCondition condition){
        if (condition.getPage() == null){
            condition.setOffset(0);
        }else {
            condition.setOffset((Math.max(condition.getPage(), 1)-1) * 10);
        }
        if (lawyerMapper!=null){
            return lawyerMapper.searchLawer(condition);
        }else {
            return new ArrayList<>();
        }
    }
}
