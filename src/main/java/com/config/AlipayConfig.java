package com.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092600602441";	
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCQOn8UONCCpGmAHagVwJ6E4g3OYCEtY643Z6g7mFCtQfzKogorF/aghHaDlTpLvf6Q796UN9DCB2mah2VY2elsUHGNtXhtly+0fsOOpqvJsYWLlNYf7fRuRKYnuMngnS5K5Z5YaPeMETL4RMdB6EvMd5vj0fO0g9n7h6DzwxHwiQpx6CYJivgrO/rqVO9oJPwIMaNkAr1QlQsd/o1vFTJf1KE6g9a8CpOJYQUDt1rMWMYToWp0wOy5SaqYxip6cuE+zzbSzBGO2GV36d8n+F+s3EddLttqOvygTVwujPNzF6ofF8Pa3/mx41MKX8CXxCWjUM1lRCKKNpH8XaCAfhx3AgMBAAECggEBAIq3ODIC0shTyQRngZoqQEwd/plW65H0JUM0dyGaRT3eEXvyjUUVLycDP9keVYszmPtdOP3lEOsMpgzx3A+wxkhetlhNCR6eIku+/+bbdq3uBztQUwEyo7zKWeQqXj+h7TwrzDfL/QrCH/uYauyAtyZYg56B95rOlYDN2YeZPk/QipgvDsBSM9lZRa0ElXyFX+gQSRteHS6a5LrIf5ZOb6NQjsedk0LXMeEqnxvkivU+NwkB8oFS9GDSvjiyO7U03PQ+RM+SW+TrKIWHeQjMRJ6noH8XR5vbfbDKZPcqDL6CLG161ik+RfYDfOBMnn+H3zSidG5CILfdSPgkFN07boECgYEA1R9P6UU/PlV1/YRlZNVT/QuhalYFR24OvgJVKBbvnN/DjiH5vn4/n13R6YFUpqGr6lzMx6XleMp+JtVp2VBRiqVMe/9Uz6BQKQCFLZytxXV/9pe9mcM1E297t6MCO+TZGPvESgXV8BKgYRa9tmknLoumxzkKfogBOck/fLLfsKkCgYEArT7dnGQ/TBjY77GZXSVfpd97lgfBQGrTbB1D2bvGCPe7Wos3bL/52izwF+BWARlikMJ1Y6n1EMDrr2KZamFUss5L0KL1opjCNhhjbqSlS+ZoPknxgWNMYOd8Q66KBNFomVPGF0Tjos1DdAgxqCN5pvNEWqXIDgUkBfEbbDik+B8CgYBaBf74VyLOzsSnUNyPijkPA3GsfCeAs7GQe2XDKGUQi8iL6jgXSjbPt46qptG+DT6UIZzynFXg/w/okW9Dt1SqTwaOvhzyExKpLyoSSUNxzB9AZ3pUUAvEaOwGdtnDuPgnQHn6lpp27TdHq5Z5TdOaKq1JLAQNzJ9P7H1fzCMG+QKBgCnq6RH7C3mtFWhBj3sDHPZ0cWGmtLKSZl9lYVJgZZUr47APuTRd6uVINDuCsyyG6NtfwamAqOQJ2bzQ3Y/oxuaQlbWAiHB0B6GxGvXdboVD1XskxwNodEWKHP3/UDPEO0vGAksFBxMQGT8M8H7fPoMPnz1TmWkTA1lQsjLoLbo/AoGBANIlWcWytA0ZFpvf3g4lCmWA9CPj4ohewAisuUbGec2YwebSBXN8JvdhzV+jVeomKAxhfyCC1had5ruzOiLRZcCT6Tj4pvgTy6q/6LD+xeAnedQQ6w2sLOYdONxr66mftONkqktVNnDv4r3yJ2kFQQfoxREEk/JMsfHIjaZ2ypk6";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1Y8HLRp80rao588lY3qEbrD6o/HQpb/Olu+AtfRWn3wDxJQGK4VB+ni5icgYwK5t/k8Fxyt8LaAB3Zw2P8Z2IDv0pqJ+3c834SR83GXXoj33Ik4MWPSkX+VOGRiFMGwL3Eamf9pnTQTU4PRS3msVRvMS7fXVM7F9zO+PbKgBHbL7jRUm8Eg9PFBA9umiYvmhefDs0yLskxuFNotGBmKz4D+NaQ5oe7gsmReErleisawRmr6bCzK9ENjsuTkpTZBizfklpB773BqHavcgptMLLb9bBshtX5D7QKLuQgz8mpfeuyfZ4kffG1L6k2c5cyvXDewTcUItAzCTE43/D+fM0QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://wqq.cross.echosite.cn/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8888/HotelOrdering/finishServlet";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

