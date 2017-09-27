/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.service.testservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.garry.java.ssm.dao.testdao.TTestMapper;
import com.garry.java.ssm.domain.po.testpo.TTest;
import com.garry.java.ssm.service.testservice.TestDBService;

/**
 * 
 * @author Garry
 * @version $Id: TestDBServiceImpl.java, v 0.1 2017年9月26日 下午5:02:06 Garry Exp $
 */
@Service
public class TestDBServiceImpl implements TestDBService {
    
    private static Logger log  = LoggerFactory.getLogger(TestDBServiceImpl.class);
    
    @Resource
    private TTestMapper tTestMapper;
    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#insert(com.garry.java.ssm.domain.po.testpo.TTest)
     */
    @Override
    public int insert(TTest record) {
        // TODO Auto-generated method stub
        return tTestMapper.insert(record);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#findByTestCode(java.lang.String)
     */
    @Override
    public TTest findByTestCode(String testCode) {
        // TODO Auto-generated method stub
        return tTestMapper.findByTestCode(testCode);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#findTestList(java.lang.String)
     */
    @Override
    public List<TTest> findTestList(String testName) {
        // TODO Auto-generated method stub
        return tTestMapper.findTestList(testName);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#deleteByTestCode(java.lang.String)
     */
    @Override
    public int deleteByTestCode(String testCode) {
        // TODO Auto-generated method stub
        return tTestMapper.deleteByTestCode(testCode);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#updateByTestCode(java.lang.String)
     */
    @Override
    public int updateByTestCode(String testCode) {
        // TODO Auto-generated method stub
        return tTestMapper.updateByTestCode(testCode);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#batchUpdateByList(java.util.List)
     */
    @Override
    public int batchUpdateByList(List<TTest> testRecordList) {
        // TODO Auto-generated method stub
        return tTestMapper.batchUpdateByList(testRecordList);
    }

    /** 
     * @see com.garry.java.ssm.service.testservice.TestDBService#batchInsert(java.util.List)
     */
    @Override
    public void batchInsert(List<TTest> testRecordList) {
        // TODO Auto-generated method stub
        
    }

}
