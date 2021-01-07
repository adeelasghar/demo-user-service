package com.dailylearningbufffer.user.service.impl;

import com.dailylearningbufffer.user.VO.Department;
import com.dailylearningbufffer.user.VO.ResponseTemplateVO;
import com.dailylearningbufffer.user.entity.User;
import com.dailylearningbufffer.user.repository.UserRepository;
import com.dailylearningbufffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment() {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        List<User> user = userRepository.findAll();

//        Department department =
//                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
//                        ,Department.class);

        vo.setUser(user);
//        vo.setDepartment(department);

        return  vo;
    }
}
