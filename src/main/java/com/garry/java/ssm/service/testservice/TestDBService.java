/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.service.testservice;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.garry.java.ssm.domain.po.testpo.TTest;

/**
 * 
 * @author Garry
 * @version $Id: TestDBService.java, v 0.1 2017年9月26日 下午4:58:22 Garry Exp $
 */
public interface TestDBService {
    /**
     * 插入单条测试数据
     * 
     * @param record
     * @return
     */
    int insert(TTest record);
    
    /**
     * 根据测试编码查询单条测试记录
     * 
     * @param testCode
     * @return
     */
    TTest findByTestCode(String testCode);
    /**
     * 根据测试名称模糊查询测试数据list
     * 
     * @param testName
     * @return
     */
    List<TTest> findTestList(String testName);
    /**
     * 根据测试编码删除指定测试记录
     * 
     * @param testCode
     * @return
     */
    int deleteByTestCode(String testCode);
    /**
     * 根据测试编码更新指定记录
     * 
     * @param testCode
     * @return
     */
    int updateByTestCode(String testCode);
    /**
     * 批量更新测试数据
     * 
     * @param testRecordList
     * @return
     */
    int batchUpdateByList(List<TTest> testRecordList);
    /**
     * 批量插入
     * 
     * @param testRecordList
     */
    void batchInsert(List<TTest> testRecordList);
}
