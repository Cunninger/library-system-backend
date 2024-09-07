package cn.yam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "borrowrecords")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrowrecords {
    @ApiModelProperty(value = "")
    private Integer recordId;

    @ApiModelProperty(value = "")
    private Integer bookId;

    @ApiModelProperty(value = "")
    private Integer userId;

    @ApiModelProperty(value = "")
    private Date borrowDate;

    @ApiModelProperty(value = "")
    private Date returnDate;
}