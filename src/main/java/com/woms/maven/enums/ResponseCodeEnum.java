package com.woms.maven.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * @author wms
 *
 * @date Jul 9, 2019
 */
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