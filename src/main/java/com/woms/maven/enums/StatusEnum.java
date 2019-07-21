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
public enum StatusEnum {
	
	/**有效数据*/
	ENABLE, 
	/**无效数据*/
	DISABLE,
	/**删除数据*/
	DELETE;

}
