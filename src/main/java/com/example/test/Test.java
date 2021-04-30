package com.example.test;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @ApiModelProperty(example = "테스트 A")
    private String a;
    @ApiModelProperty(example = "테스트 B")
    private String b;
}
