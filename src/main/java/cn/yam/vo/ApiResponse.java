package cn.yam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/8/8 上午10:46
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

}