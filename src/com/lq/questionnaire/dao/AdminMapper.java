package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.Admin;

public interface AdminMapper {
    Admin selectByAdminLoginName(String adminLoginName);
    
    Admin selectByAdminId(String adminId);
    
    int deleteByAdminId(String adminId);
    
    int insertAdmin(Admin admin);
}