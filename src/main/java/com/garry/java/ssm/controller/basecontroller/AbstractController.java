/**
 * 深圳金融电子结算中心
 * Copyright (c) 1995-2017 All Rights Reserved.
 */
package com.garry.java.ssm.controller.basecontroller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.MessageFormat;

import javax.servlet.ServletOutputStream;

import org.springframework.stereotype.Controller;

import com.garry.java.ssm.common.contants.Contant;

/**
 * 业务控制抽象类
 * @author Garry
 * @version $Id: AbstractController.java, v 0.1 2017年9月26日 下午4:54:41 Garry Exp $
 */
@Controller
public abstract class AbstractController {
    
    private static final String        xmlHead         = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
    //查询日期响应报文
    private static final MessageFormat DAY_RESPONSE    = new MessageFormat(Contant.DAYRESPONSEXML);

    protected void writeResponse(ServletOutputStream sos, String returnCode, String returnMsg, String statusCode, String statusDesc, String datas, String desc, boolean result) {
        //应答内容
        String responseXml = DAY_RESPONSE.format(new Object[] { returnCode, returnMsg, statusCode, statusDesc, datas });

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sos, Contant.CHARSET));
            writer.write(xmlHead + responseXml);
            writer.flush();
            if (result) {
                //成功
            } else {
                //失败
                throw new RuntimeException("[" + desc + "],写出失败响应[" + responseXml + "]");
            }
        } catch (IOException e) {
            throw new RuntimeException("写出响应失败", e);
        }
    }
}
