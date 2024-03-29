package com.example.demo.service;

import com.example.demo.dto.PageResultDto;
import com.example.demo.model.User;
import org.springframework.data.domain.Pageable;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/

public interface UserService {

     void addUser(User user);

     PageResultDto<User> findByall(Pageable pageable);

}
