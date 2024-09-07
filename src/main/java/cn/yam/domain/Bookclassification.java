package cn.yam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "bookclassification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookclassification {
    /**
     * 分类编号，主键
     */
    @ApiModelProperty(value = "分类编号，主键")
    private Integer classificationId;

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称")
    private String className;

    /**
     * 分类描述
     */
    @ApiModelProperty(value = "分类描述")
    private String classDescription;
}