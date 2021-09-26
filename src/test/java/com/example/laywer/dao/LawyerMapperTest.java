package com.example.laywer.dao;

import com.example.laywer.pojo.Lawer;
import com.example.laywer.pojo.SearchCondition;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LawyerMapperTest {
    @Autowired
    LawyerMapper lawyerMapper;
    @Test
    void searchLawer() {
        System.out.println(lawyerMapper);
        List<Lawer> lawers = lawyerMapper.searchLawer(new SearchCondition("广东省", "广州市", "番禺区", "交通类", 0,0));
        System.out.println(lawers);
    }
}