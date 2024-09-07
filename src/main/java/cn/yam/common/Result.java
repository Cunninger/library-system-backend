package cn.yam.common;

/**
 * 功能：
 * 日期：2024/8/14 下午4:25
 */
public class Result {
    private String code;
    private String message;
    private Object data;

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result success(String message, Object data) {
        return new Result("200", message, data);
    }

    public static Result error(String code, String message) {
        return new Result(code, message, null);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}