package com.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Reviews;
import com.dao.ReviewsMapper;
import com.services.ReviewService;
@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewsMapper reviewsMapper;

	@Override
	public void addReviewServlet(Reviews review) {
		reviewsMapper.insert(review);
		
	}

}
