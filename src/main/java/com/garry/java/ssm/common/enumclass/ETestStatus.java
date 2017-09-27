/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.common.enumclass;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Garry
 * @version $Id: ETestStatus.java, v 0.1 2017年9月27日 下午3:35:09 Garry Exp $
 */
public enum ETestStatus implements BaseEnum<ETestStatus, String>{
    NORMAL("00","正常"),
    UNNORMAL("01","不正常")
        ;
    private String value;
    private String displayName;
    
    private static final Map<String,ETestStatus> map = new HashMap<String, ETestStatus>();
    static {
        for (ETestStatus testStatus : ETestStatus.values()) {
            map.put(testStatus.getValue(), testStatus);
        }
    }
    private ETestStatus(String value, String displayName) {
        // TODO Auto-generated constructor stub
        this.value = value;
        this.displayName = displayName;
    }
    /**
     * Setter method for property <tt>value</tt>.
     * 
     * @param value value to be assigned to property value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Setter method for property <tt>displayName</tt>.
     * 
     * @param displayName value to be assigned to property displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /** 
     * @see com.garry.java.ssm.common.enumclass.BaseEnum#getValue()
     */
    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return this.value;
    }

    /** 
     * @see com.garry.java.ssm.common.enumclass.BaseEnum#getDisplayName()
     */
    @Override
    public String getDisplayName() {
        // TODO Auto-generated method stub
        return this.displayName;
    }

    /** 
     * @see com.garry.java.ssm.common.enumclass.BaseEnum#getEnum(java.lang.Object)
     */
    @Override
    public ETestStatus getEnum(String value) {
        // TODO Auto-generated method stub
        return map.get(value);
    }
    /**
     * 枚举转换
     */
    public static ETestStatus parseOf( String value ) {
        for ( ETestStatus item : values() )
            if ( item.getValue().equals( value ) )
                return item;
        throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
    }
    /**
     * 通过key获取name
     * 
     * @param value
     * @return
     */
    public static String getDisplayNameByValue(String value) {
        if(StringUtils.isBlank(value)) {
            return "";
        }
        ETestStatus refundStatus = map.get(value);
        if(refundStatus != null) {
            return refundStatus.getDisplayName();
        }
        return "";
    }

}
