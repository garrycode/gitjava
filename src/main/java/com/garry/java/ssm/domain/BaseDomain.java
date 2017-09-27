/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * @author Garry
 * @version $Id: BaseDomain.java, v 0.1 2017年9月26日 下午5:41:44 Garry Exp $
 */
public class BaseDomain implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
