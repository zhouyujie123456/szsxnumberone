package com.aaa.ssm.util;

/**
 * fileName:JedisUtil
 * description:
 * author:zyj
 * createTime:2019/3/2 18:37
 */
public interface JedisUtil {
    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);
    /**
     * 清除缓存
     * @param arg0
     * @return
     */
    Object removeObject(Object arg0);
    /**
     * 从缓存中获取
     * @param arg0
     * @return
     */
    Object getObject(Object arg0);
}
