package com.services;

import java.util.List;

import com.bean.Dishes;
import com.github.pagehelper.PageInfo;

public interface DishService {
	
	public PageInfo<Dishes> showallDishes(Integer pageNum , Integer pageSize);
	
	public void deleteDishes(String dishName);
	
	public void updateDish(Dishes dish);

	public PageInfo<Dishes> showDishByClassify(String name,Integer pageNum, Integer pageSize);
	
	public void addDish(Dishes dish);
	
	public PageInfo<Dishes> findDishByName(String name,Integer pageNum, Integer pageSize);
}
