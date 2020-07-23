package com.example.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class LightValueTree extends LightValue {
    private List<LightValueTree> children;
}
