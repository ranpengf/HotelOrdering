package com.services;

import java.util.List;

import com.bean.Classify;

public interface ClassifyService {

	List<String> getAllClassify() throws Exception;

	void addClassify(Classify classify) throws Exception;

	void updateClassify(Classify classify) throws Exception;

	void deleteClassify(String name) throws Exception;

}
