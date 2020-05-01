<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>付款</title>
</head>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.config.*"%>
<%@ page import="com.alipay.api.*"%>
<%@ page import="com.alipay.api.request.*"%>
<%
	//获得初始化的AlipayClient
	AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
	
	//设置请求参数
	AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	alipayRequest.setReturnUrl(AlipayConfig.return_url);
	alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
	
	
	String s =request.getQueryString();
	String[] str = s.split("&");
	int index=str[2].indexOf("=");
	
	
	
	//request.getParameter(request.getParameter("WIDout_trade_no"));
	//商户订单号，商户网站订单系统中唯一订单号，必填
	String out_trade_no = new String(str[2].substring(index+1, str[2].length()));
	//付款金额，必填
	index=str[0].indexOf("=");
	String total_amount = new String(str[0].substring(index+1, str[0].length()));
	//订单名称，必填
	index=str[1].indexOf("=");
	String subject = new String(str[1].substring(index+1, str[1].length()));
	//商品描述，可空
	index=str[3].indexOf("=");
	String body = new String(str[3].substring(index+1, str[3].length()));
	
	alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
			+ "\"total_amount\":\""+ total_amount +"\"," 
			+ "\"subject\":\""+ subject +"\"," 
			+ "\"body\":\""+ body +"\"," 
			+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
	
	//若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明

	//请求
	String result = alipayClient.pageExecute(alipayRequest).getBody();
	
	//输出
	out.println(result);
%>
<body>
</body>
</html>