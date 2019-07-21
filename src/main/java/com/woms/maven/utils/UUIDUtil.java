package com.woms.maven.utils;

import java.util.UUID;
/**
 * 
 * @author wms
 *
 */
public class UUIDUtil {
	
    /**
     * 生成32位UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
