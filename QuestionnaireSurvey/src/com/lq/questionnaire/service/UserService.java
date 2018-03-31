package com.lq.questionnaire.service;

import com.lq.questionnaire.pojo.User;

public interface UserService {
	public User getUserByUserId(String userId);
	
	public String getUserByLoginName(User user);
}
