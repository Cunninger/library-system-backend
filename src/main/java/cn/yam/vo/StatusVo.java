package cn.yam.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/8/11 上午8:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusVo {
    Integer bookId;
    Object status;
}