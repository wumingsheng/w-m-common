package com.github.wumingsheng.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
	
	/*请求成功*/
	OK(200, "ok"),
	/*非法请求*/
	CLIENT_ERROR(400, "Bad Request"),
	/*服务端错误*/
	SERVER_ERROR(500, "server error");
	
	private Integer code;
	
	private String desc;
	
	
	public static String getDesc(int code) {
		for (ResponseCodeEnum en : ResponseCodeEnum.values()) {
			if (en.getCode().equals(code)) {
				return en.desc;
			}
		}
		return null;
	}

}
