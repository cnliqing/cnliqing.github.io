package com.lq.questionnaire.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lq.questionnaire.dao.UserMapper;
import com.lq.questionnaire.pojo.User;
import com.lq.questionnaire.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource  
    private UserMapper userDao;  
    
    @Override  
    public User getUserByUserId(String userId) {
        return this.userDao.selectByUserId(userId);
    }
    
    @Override
    public String getUserByLoginName(User user){
    	String result = "error";
    	User userResult = this.userDao.selectByLoginName(user.getUserLoginName());
    	
    	if(userResult != null){
    		if(userResult.getUserPasswd().equals(user.getUserPasswd())){
    			result = "success";
    		} else {
    			return result;
			}
    	} else {
    		return result;
		}
    	
    	return result;
    }
}
