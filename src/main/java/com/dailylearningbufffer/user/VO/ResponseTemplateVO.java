package com.dailylearningbufffer.user.VO;

import com.dailylearningbufffer.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private List<User> user;
    private Department department;
}