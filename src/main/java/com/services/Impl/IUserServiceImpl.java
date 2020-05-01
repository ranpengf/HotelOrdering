package com.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Vuser;
import com.bean.VuserExample;
import com.bean.VuserExample.Criteria;
import com.dao.VuserMapper;
import com.services.IUserService;


@Service
public class IUserServiceImpl implements IUserService {
	@Autowired 
	VuserMapper vuserMapper;

	@Override
	public void registerUser(Vuser user)  {
		vuserMapper.insert(user);
	}

	@Override
	public Vuser loginUser(String name, String password,String isadmin)  {
		VuserExample vuserExample = new VuserExample();
		Criteria criteria = vuserExample.createCriteria();
		criteria.andPhonenumEqualTo(name);
		criteria.andPasswordEqualTo(password);
		if("true".equals(isadmin)){
			criteria.andIsadminEqualTo("yes");
		}
		List<Vuser> list = vuserMapper.selectByExample(vuserExample);
		if(list.size()!=0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Vuser getUserByName(String name) {
		VuserExample vuserExample = new VuserExample();
		Criteria criteria = vuserExample.createCriteria();
		criteria.andRelnameEqualTo(name);
		List<Vuser> list = vuserMapper.selectByExample(vuserExample);
		return list.get(0);
	}

	@Override
	public void updateUserInfo(Vuser user)  {
		VuserExample vuserExample = new VuserExample();
		Criteria criteria = vuserExample.createCriteria();
		vuserMapper.updateByExample(user, vuserExample);
		
	}
	

}
