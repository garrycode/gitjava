/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.garry.java.ssm.BaseTest;
import com.garry.java.ssm.common.enumclass.ETestStatus;
import com.garry.java.ssm.domain.po.testpo.TTest;
import com.garry.java.ssm.service.testservice.TestBatchInsert;
import com.garry.java.ssm.service.testservice.TestDBService;


/**
 * 
 * @author Administrator
 * @version $Id: TestDB.java, v 0.1 2017年9月27日 下午3:29:01 Administrator Exp $
 */

public class DBTest extends BaseTest {
    
    @Resource
    private TestDBService testDBService;
    
    @Resource 
    private TestBatchInsert testBatchInsert;
    
    @Test
    public void testInsert() {
        
        TTest record = new TTest();
        record.setTestName("testName1");
        record.setTestCode(System.currentTimeMillis() + "1");
        record.setTestModule("test module");
        record.setTestStatus(ETestStatus.NORMAL.getValue());
        record.setCreateTime(new Date());
        testDBService.insert(record );
    }
    @Test
    public void testFindTestByTestCode() {
       TTest record =  testDBService.findByTestCode("15065037738751");
       Assert.assertNotNull(record);
    }
    @Test
    public void testFindList() {
        List<TTest> list = testDBService.findTestList("Name");
        Assert.assertNotNull(list);
    }
    @Test
    public void testDelete() {
        testDBService.deleteByTestCode("15065037738751");
    }
    @Test
    public void testUpdate() {
        testDBService.updateByTestCode("15065039072101");
    }
    @Test
    public void testBatchUpdate() {
        TTest t1 = new TTest();
        t1.setTestCode("15065035110811");
        TTest t2 = new TTest();
        t2.setTestCode("15065039072101");
        List<TTest> list = Arrays.asList(t1,t2);
        testDBService.batchUpdateByList(list);
    }
    @Test
    public void testBatchInsert() {
        List<TTest> list = new ArrayList<TTest>();
        for (int i = 11; i < 2000; i++) {
            TTest record = new TTest();
            record.setTestName("testName" + i);
            record.setTestCode(System.currentTimeMillis() + "" + i);
            record.setTestModule("test module" + i);
            record.setTestStatus(ETestStatus.NORMAL.getValue());
            record.setCreateTime(new Date());
            list.add(record);
        }
        try {
            testBatchInsert.batchInsert(list);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
