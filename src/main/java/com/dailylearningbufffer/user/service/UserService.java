package com.dailylearningbufffer.user.service;

import com.dailylearningbufffer.user.VO.ResponseTemplateVO;
import com.dailylearningbufffer.user.entity.User;

public interface UserService {

    User saveUser(User user);

    ResponseTemplateVO getUserWithDepartment();
}
