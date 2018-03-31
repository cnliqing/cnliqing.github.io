package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.User;

public interface UserMapper {
	User selectByUserId(String userId);
    
    User selectByLoginName(String loginName);
}