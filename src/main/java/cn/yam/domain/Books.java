package cn.yam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @ApiModelProperty(value = "")
    private Integer bookId;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private String author;

    @ApiModelProperty(value = "")
    private String publisher;

    @ApiModelProperty(value = "")
    private Integer yearPublished;

    @ApiModelProperty(value = "")
    private Object status;

    /**
     * 图书分类编号，外键
     */
    @ApiModelProperty(value = "图书分类编号，外键")
    private Integer classificationId;

    /**
     * 图书馆外键
     */
    @ApiModelProperty(value = "图书馆外键")
    private Integer libraryId;
}