package cn.yam.exception;

import lombok.Getter;

/**
 * 功能：
 * 日期：2024/8/14 下午4:17
 */
@Getter
public class ServiceException extends RuntimeException {
    private final String code;

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }
    public ServiceException(String message) {
        super(message);
        this.code = "500";
    }
}