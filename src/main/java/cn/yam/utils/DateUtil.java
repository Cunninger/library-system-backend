package cn.yam.utils;

/**
 * 功能：
 * 日期：2024/8/14 下午5:06
 */
import java.util.Calendar;
import java.util.Date;
// 处理日期的工具类
public class DateUtil {

    /**
     * Offsets the given date by the specified number of hours.
     *
     * @param date the date to be offset
     * @param hours the number of hours to offset
     * @return the new date offset by the specified number of hours
     */
    public static Date offsetHour(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hours);
        return calendar.getTime();
    }
}