package com.example.laywer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchCondition {
    private String province;
    private String city;
    private String region;
    private String expert_area;
    private Integer page;
    private Integer offset;
}
