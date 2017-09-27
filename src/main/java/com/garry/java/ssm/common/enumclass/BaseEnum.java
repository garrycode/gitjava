/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.common.enumclass;

/**
 * 
 * @author Garry
 * @version $Id: BaseEnum.java, v 0.1 2017年9月27日 下午3:38:19 Garry Exp $
 */
public interface BaseEnum<E extends Enum<?>, T> {
    /**
     * 获取枚举key
     * 
     * @return
     */
    T getValue();
    /**
     * 获取枚举名字
     * 
     * @return
     */
    String getDisplayName();
    /**
     * 获取枚举
     * 
     * @param value
     * @return
     */
    E getEnum(T value);
}
