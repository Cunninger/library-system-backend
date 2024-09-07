package cn.yam.utils;

/**
 * 功能：
 * 日期：2024/8/14 下午4:41
 */
public class StrUtil {
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}