package com.bean;

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
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCsK7j3F6tPA6apHwHfHSJZGBA6u2iPIJ4c00ggCLTMbI2CQ5T/UCM3jkXDb+YYlLbBP2zB+q4k9ey0zjmH/rN1KJYd+pZTkWMt5GM7OlxNQ9itsM66U05aWBh2u+2On6c0VZoxmQzDFxVX03J4Ktt0Yh9MojwTvEpUj8rYR/zxesbmJ+iKu1br1UKrbyAxOcQPfQl9gPfFqu3nd4F3P7AWyi9qDKf62aJ/jRhgqu6i2UpXYDCnC6VraV45vhQtY1RnAVFp0uiC2a/PKuCI19ybBepFDKbVeEOoCrX6w346/crX3UjqOZe95loe8NTAIJ+xbMxnJgu+3Bf5w6qDQM1PAgMBAAECggEASH/c0ofwBkTGUF8TPa2aAiRk6SZzoBmfGwpJS9v+rjpj2F+3BU/slH9fly2umdk9n+CiXoi9/ihktbpFdaPmU8Z0eElGNgh52CBdPNqVdZ/FRVa3prRfwSFpo838+dr24M3PMWV+f0RgI2yRvlJluPt8rJuAatsV/cfTJgIiXFiho0gDYOlcKBY31zD23+vVM67Pkw2b3/x8y6sc2NwxE5HWHPqED/OIuH8fBlW4ALG1UhUChsYaRwbTaRVTGMqJZXLeCD7c1hATeAz/Vg7BfE5zc2w3EjO5riiW0K3VB1IEu31xpqzW31yoLkffLJQO0qLUR14i/altssBHtfyhGQKBgQDwsy2B49si0do/D9pb1AXHjU5FWOvlzEJJ5zunqiRlJDvm62k/86WPXLgHSLxnmEBGI3WANMnM+eK3l1u+o+Y0gCJHrS9gRZsu5MpaGeaZx7/bUVZd0gEWr1gCLcdfgmY32uJa2IQQIcREjsFb6mt7AAYDnoPIC4Hhek5SpFKvywKBgQC3HWUvN4sQeeBMf2a8sY5Kan2fSgUhIraLrURL+Zrha/Ta3kWYE021Wgc1wj0wIJN80OzwEM/34T/nvvnyCaLNsd0V5atOFhujVsbBpNi4UbhwNOZz7BKJlByjhKkGZaIQtMVzS5kvcgXVKHAiJJd5SXtGz4gXrUNhYYFS862gDQKBgQC2BFj6a2swFo86tutCG8BPGe1Bha/Fs8PBDSpQbNpe3Zqq0gRiRwZAtjW31Goc0MZyA6h8Te74oVKv0LahIGIZ+3dwymcUHy7ttDfNEN8QFTxhRk3QXtlR5UDhTOsCr6JKxKv9VNPxOwenbGiN8GRcvDTQEdPHt+P8tTd7SSX6JwKBgAKDwNP5K0u6oL3sMfj9ZzrWY4tAdPmThHY+luWENABMfzxSORpxiWuoJNk0Jar3h477P4W8dV6uFTaVhNEyGK5CdwrJ8KRN4WtI0cnu/ZrqZGIGF/QXldmV0x7bv4Z69tLL6LpAm4XvRu06dO/DGOFthOfgCbppgrdfo2sENaoxAoGAPO22DEntPKgzorW5j2WrmI/umR8Dks49kId+YQuIu9xCKbtp6FpVCzKsYKaN42HGiNGQLsHh0embce14khBLxO7/xa3JYOPOj6yGYINH6KDrIhLUCYNQagDATMSvCySKkqzAsghie4FiKMC9ONxENYOsVLD233C9Hl6370Jbwss=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArCu49xerTwOmqR8B3x0iWRgQOrtojyCeHNNIIAi0zGyNgkOU/1AjN45Fw2/mGJS2wT9swfquJPXstM45h/6zdSiWHfqWU5FjLeRjOzpcTUPYrbDOulNOWlgYdrvtjp+nNFWaMZkMwxcVV9NyeCrbdGIfTKI8E7xKVI/K2Ef88XrG5ifoirtW69VCq28gMTnED30JfYD3xart53eBdz+wFsovagyn+tmif40YYKruotlKV2Awpwula2leOb4ULWNUZwFRadLogtmvzyrgiNfcmwXqRQym1XhDqAq1+sN+Ov3K191I6jmXveZaHvDUwCCfsWzMZyYLvtwX+cOqg0DNTwIDAQAB/GITeFMjuJBRvmG7W4J2QusVFscdzZs2qbO15KlySWOxxlF8NU1FGQHxIU/Q5VrQioQoGIq0tkrz8GlebL64rmTJSulTA1R9zmhkGzQEnZ2qoev52Mx9LlnmRdEsubwzCupz2aPPC7zN5wiAjX6aiAPM4epjkADe+cIIvDldO/6d074CQ9a14mQOqPAqs6hjMxdtXNTRT5EjVa2Bpr+yr2E9HQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://wqq.cross.echosite.cn/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://wqq.cross.echosite.cn/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

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

