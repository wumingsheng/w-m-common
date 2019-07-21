package com.github.wumingsheng.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
public enum StatusEnum {
	
	/**有效数据*/
	ENABLE, 
	/**无效数据*/
	DISABLE,
	/**删除数据*/
	DELETE;

}
