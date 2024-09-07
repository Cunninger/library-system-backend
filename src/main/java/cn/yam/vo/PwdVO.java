package cn.yam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


/**
 * 功能：
 * 日期：2024/8/10 下午7:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PwdVO {
    @NotNull
    private Integer userId;
    @NotNull
    private String oldPwd;
    @NotNull
    private String newPwd;
}