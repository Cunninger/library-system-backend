package cn.yam.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @ApiModelProperty(value = "")
    private Integer userId;

    @ApiModelProperty(value = "")
    private String username;

    @ApiModelProperty(value = "")
    private String password;

    @ApiModelProperty(value = "")
    private Object role;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phone;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "Token")
    private String token;
}