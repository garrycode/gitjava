package com.garry.java.ssm.domain.po.testpo;

import java.util.Date;

public class TTest {
    private String testName;

    private String testModule;

    private String testCode;

    private String testStatus;

    private Date createTime;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public String getTestModule() {
        return testModule;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule == null ? null : testModule.trim();
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode == null ? null : testCode.trim();
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus == null ? null : testStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}