package com.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Classify;
import com.bean.ClassifyExample;
import com.dao.ClassifyMapper;
import com.services.ClassifyService;

@Service
public class ClassifyServiceImpl implements ClassifyService {
	@Autowired
	ClassifyMapper classifyMapper;

	@Override
	public List<String> getAllClassify() throws Exception {
		List<String> result = new ArrayList<>();
		List<Classify> list = classifyMapper.selectByExample(new ClassifyExample());
		for (Classify c : list) {
			result.add(c.getName());
		}
		return result;
	}

	@Override
	public void addClassify(Classify classify) throws Exception {
		classifyMapper.insert(classify);
	}

	@Override
	public void updateClassify(Classify classify) throws Exception {
		classifyMapper.updateByExample(classify, new ClassifyExample());
	}

	@Override
	public void deleteClassify(String name) throws Exception {
		 ClassifyExample example = new ClassifyExample();
		 example.createCriteria().andNameEqualTo(name);
		 classifyMapper.deleteByExample(example);
	}

}
