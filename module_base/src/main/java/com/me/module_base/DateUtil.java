package com.me.module_base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Author: ChenGuiPing
 * Date: 2021/9/17
 * Description:
 */
public class DateUtil {

    public static Date getDateBegin(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static String getDateBeginStr(Date date) {
        return String.valueOf(getDateBegin(date).getTime());
    }

    public static Date getDateEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static String getDateEndStr(Date date) {
        return String.valueOf(getDateEnd(date).getTime());
    }

    public static String formatDefaultPattern(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(date);
    }

    public static String formatDefaultPattern(String date) {
        if (date == null) {
            return "--";
        }
        Date d = new Date(Long.parseLong(date));
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(d);
    }

}
