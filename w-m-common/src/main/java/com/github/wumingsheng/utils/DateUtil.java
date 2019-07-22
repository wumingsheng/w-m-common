package com.github.wumingsheng.utils;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;


public class DateUtil {
	
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	//date转字符串
	public static String format(Date date, String format) {
		if(null == date) {
			return null;
		}
		if(StringUtils.isNotBlank(format)) {
			return DateTimeFormatter.ofPattern(format).format(date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalDateTime());
		}
		return DATE_FORMATTER.format(date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalDateTime());
	}
	//字符串转date
	public static Date parse(String date, String format) {
		if(StringUtils.isBlank(date)) {
			return null;
		}
		LocalDateTime localDateTime = LocalDateTime.parse(date, DATE_FORMATTER);
		if(StringUtils.isNotBlank(format)) {
			localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern(format));
		}
		ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }
	
	
	

}