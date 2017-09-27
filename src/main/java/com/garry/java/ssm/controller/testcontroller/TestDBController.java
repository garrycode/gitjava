/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.controller.testcontroller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garry.java.ssm.controller.basecontroller.AbstractController;
import com.garry.java.ssm.service.testservice.TestDBService;

/**
 * 
 * @author Garry
 * @version $Id: TestDBController.java, v 0.1 2017年9月26日 下午4:56:04 Garry Exp $
 */
@Controller
@RequestMapping(value="/test", method = RequestMethod.GET)
public class TestDBController extends AbstractController {
    
    private static Logger log = LoggerFactory.getLogger(TestDBController.class);
    
    @Resource
    private TestDBService testDBService;
    
    @RequestMapping("/find")
    public void testRequest(HttpServletRequest request, HttpServletResponse response) {
        long requestTime = System.currentTimeMillis();
        log.info("接收请求时间:{}", requestTime);
        ServletOutputStream sos = null;
        try {
            sos = response.getOutputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        writeResponse(sos,"0000","success","20170927","ok","success data","20170927",true);
    }
}
