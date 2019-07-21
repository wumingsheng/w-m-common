package com.woms.maven.entity;

import com.woms.maven.enums.ResponseCodeEnum;

import lombok.Data;

@Data
public class ResponseResult<T> {

	private String message;

	private T data;

	private int code;

	@Override
	public String toString() {
		return "Result [retMsg=" + message + ", data=" + data + ", retCode=" + code + "]";
	}

	public static <T> ResponseResult<T> getInstance(T data, int retCode) {
		return new ResponseResult<>(data, retCode);
	}

	public static <T> ResponseResult<T> ok(T data) {

		return ResponseResult.getInstance(data, ResponseCodeEnum.OK.getCode());

	}

	public static <T> ResponseResult<T> serverError() {

		return ResponseResult.getInstance(null, ResponseCodeEnum.SERVER_ERROR.getCode());

	}
	public static <T> ResponseResult<T> clientError() {
		
		return ResponseResult.getInstance(null, ResponseCodeEnum.CLIENT_ERROR.getCode());
		
	}
	
	
	
	
	public ResponseResult(T data, int stateCode) {
        this.code = stateCode;
        this.data = data;
        this.message = ResponseCodeEnum.getDesc(stateCode);
    }

}
