/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.service.testservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.druid.pool.DruidDataSource;
import com.garry.java.ssm.domain.po.testpo.TTest;

/**
 * 
 * @author Administrator
 * @version $Id: TestBatchInsert.java, v 0.1 2017年9月27日 下午6:06:08 Administrator Exp $
 */
@Service
public class TestBatchInsert {

    private static Logger          log = LoggerFactory.getLogger(TestBatchInsert.class);

    private static String          sql = "INSERT INTO T_TEST(TEST_NAME, TEST_MODULE, TEST_CODE, TEST_STATUS, CREATE_TIME) VALUES(?,?,?,?,?)";

    @Resource
    private DruidDataSource dataSource;

    /**
     * 
     * @param list
     * @throws SQLException 
     */
    public void batchInsert(List<TTest> list) throws SQLException {
        // TODO Auto-generated method stub
        Connection con = getConnection();
        con.setAutoCommit(false);
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            final int batchSize = 1000;
            int count = 0;

            for (TTest tTest : list) {
                ps.setString(1, tTest.getTestName());
                ps.setString(2, tTest.getTestModule());
                ps.setString(3, tTest.getTestCode());
                ps.setString(4, tTest.getTestStatus());
                ps.setDate(5, new java.sql.Date(tTest.getCreateTime().getTime()));
                ps.addBatch();
                if (++count % batchSize == 0) {
                    ps.executeBatch();
                    con.commit();
                    count = 0;
                }

            }
            ps.executeBatch();
            con.commit();
        } catch (SQLException e) {
            con.rollback();
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
                ps = null;
            }
            if (con != null) {
                con.close();
                con = null;
            }
        }
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
