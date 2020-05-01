package com.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Classify;
import com.bean.ClassifyExample;
import com.bean.Classifydishes;
import com.bean.ClassifydishesExample;
import com.bean.Dishes;
import com.bean.DishesExample;
import com.dao.ClassifyMapper;
import com.dao.ClassifydishesMapper;
import com.dao.DishesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.services.DishService;

@Service
public class DishServiceImpl implements DishService {
	@Autowired
	private DishesMapper dishesMapper;
	@Autowired
	private ClassifyMapper classifyMapper;
	@Autowired
	private ClassifydishesMapper classifydishesMapper;



	@Override
	public void deleteDishes(String dishName) {
		DishesExample example = new DishesExample();
		example.createCriteria().andNameEqualTo(dishName);
		dishesMapper.deleteByExample(example);

	}

	@Override
	public void updateDish(Dishes dish) {
		DishesExample example = new DishesExample();
		dishesMapper.updateByExample(dish, example);
	}

	@Override
	public PageInfo<Dishes> showDishByClassify(String name,Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum , pageSize);
		List<Dishes> list = new ArrayList<>();
		ClassifyExample example = new ClassifyExample();
		example.createCriteria().andNameEqualTo(name);
		List<Classify> classlist = classifyMapper.selectByExample(example);
		ClassifydishesExample cdExample = new ClassifydishesExample();
		cdExample.createCriteria().andClassifyidEqualTo(classlist.get(0).getId());
		List<Classifydishes> selectByExample = classifydishesMapper.selectByExample(cdExample);
		for (Classifydishes cd : selectByExample) {
			DishesExample dishe = new DishesExample();
			dishe.createCriteria().andIdEqualTo(cd.getDishid());
			List<Dishes> dishlist = dishesMapper.selectByExample(dishe);
			if (dishlist.get(0) != null) {
				list.add(dishlist.get(0));
			}
		}
		PageInfo<Dishes> pageinfo = new PageInfo(list);
		return pageinfo;
	}

	@Override
	public void addDish(Dishes dish) {
		dishesMapper.insert(dish);
	}

	@Override
	public PageInfo<Dishes> showallDishes(Integer pageNum, Integer pageSize) {
		DishesExample example = new DishesExample();
		PageHelper.startPage(pageNum , pageSize);
		List<Dishes> list = dishesMapper.selectByExample(example);
		PageInfo<Dishes> pageinfo = new PageInfo(list);
		return pageinfo;
	}

	@Override
	public PageInfo<Dishes> findDishByName(String name, Integer pageNum, Integer pageSize) {
		DishesExample example = new DishesExample();
		PageHelper.startPage(pageNum , pageSize);
		example.createCriteria().andNameLike("%"+name+"%");
		List<Dishes> list = dishesMapper.selectByExample(example);
		PageInfo<Dishes> pageinfo = new PageInfo(list);
		return pageinfo;
	}

}
