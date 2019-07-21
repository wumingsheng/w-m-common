package com.github.wumingsheng.utils;

import java.util.UUID;

public class UUIDUtil {
	
    /**
     * 生成32位UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
