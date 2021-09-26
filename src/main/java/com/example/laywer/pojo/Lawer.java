package com.example.laywer.pojo;


import lombok.Data;

/**
 * Auto-generated: 2021-09-26 13:7:57
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Lawer {
    private Integer id; //律师id
    private String name; //律师姓名
    private String office; //事务所
    private String province; //省份
    private String city; //城市
    private String region; //区
    //private String age_limit;  //从业事件
    private String score;   //综合评分
    private String expert_area;  //擅长领域
    private String profession_score;  //专业评分
    private Integer label;  //是否是合法的
}