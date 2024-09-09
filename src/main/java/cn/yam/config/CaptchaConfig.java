package cn.yam.config;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 * 日期：2024/9/9 上午11:03
 */
@Component
public class CaptchaConfig {
    private final Map<String,String> CAPTCHA_MAP = new HashMap<>();

    public Map<String, String> getCaptchaMap() {
        return CAPTCHA_MAP;
    }
}