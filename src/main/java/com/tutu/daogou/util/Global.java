package com.tutu.daogou.util;

import tool.util.NumberUtil;
import tool.util.StringUtil;

import java.util.Map;

/**
 * 启动加载缓存类
 * 
 * @author gc
 * @version 1.0.0
 * @date 2016年11月11日 下午3:37:13
 * Copyright 杭州融都科技股份有限公司  All Rights Reserved
 * 官方网站：www.erongdu.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
public class Global {

	public static Map<String, Object> configMap;

	public static Map<String, Object> msg_template_Map;

	public static int getInt(String key){
		return NumberUtil.getInt(StringUtil.isNull(configMap.get(key)));
	}

	public static double getDouble(String key){
		return NumberUtil.getDouble(StringUtil.isNull(configMap.get(key)));
	}

	public static String getValue(String key) {
		return StringUtil.isNull(configMap.get(key));
	}

	public static Object getObject(String key){
		return configMap.get(key);
	}

	public static String getMsgTempLate(String key) {
		return StringUtil.isNull(msg_template_Map.get(key));
	}

}
