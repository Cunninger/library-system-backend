package cn.yam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "readers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Readers {
    @ApiModelProperty(value = "")
    private Integer readerId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String contactInfo;

    @ApiModelProperty(value = "")
    private String password;
}