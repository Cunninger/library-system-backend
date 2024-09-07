package cn.yam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="library")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    @ApiModelProperty(value="")
    private Integer libraryId;

    @ApiModelProperty(value="")
    private String libraryName;

    @ApiModelProperty(value="")
    private String address;
}