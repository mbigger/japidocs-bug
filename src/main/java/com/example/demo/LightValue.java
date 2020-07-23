package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LightValue {
    private String name;
    private String type;
    private Integer id;
    private Integer value;
    private Date updateTime;
}
