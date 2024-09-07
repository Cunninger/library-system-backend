package cn.yam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/8/8 下午3:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterVo {
    private String username;
    private String password;
}