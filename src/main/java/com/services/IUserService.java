package com.services;
import org.springframework.stereotype.Service;

import com.bean.Vuser;

@Service
public interface IUserService {
	/**
	 * 注册
	 * */
	public void registerUser(Vuser user) ;
	/**
	 * 登陆
	 * */
	public  Vuser loginUser(String name,String password,String isadmin);
	/**
	 * 用户名唯一验证
	 * */
	public  Vuser getUserByName(String name);
	/**
	 * 修改用户信息
	 * */
	public void updateUserInfo(Vuser user);
	
}