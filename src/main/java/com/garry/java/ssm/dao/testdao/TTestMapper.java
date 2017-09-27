package com.garry.java.ssm.dao.testdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.garry.java.ssm.domain.po.testpo.TTest;

public interface TTestMapper {
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
    TTest findByTestCode(@Param("testCode") String testCode);
    /**
     * 根据测试名称模糊查询测试数据list
     * 
     * @param testName
     * @return
     */
    List<TTest> findTestList(@Param("testName") String testName);
    /**
     * 根据测试编码删除指定测试记录
     * 
     * @param testCode
     * @return
     */
    int deleteByTestCode(@Param("testCode") String testCode);
    /**
     * 根据测试编码更新指定记录
     * 
     * @param testCode
     * @return
     */
    int updateByTestCode(@Param("testCode") String testCode);
    /**
     * 批量更新测试数据
     * 
     * @param testRecordList
     * @return
     */
    int batchUpdateByList(List<TTest> testRecordList);
    int insertSelective(TTest record);
    
}