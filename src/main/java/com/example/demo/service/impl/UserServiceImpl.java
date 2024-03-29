package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.PageResult;
import com.example.demo.dto.PageResultDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public PageResultDto<User> findByall(Pageable pageable){
        Page<User> page = userDao.findAll(pageable);
        return new PageResult<User>().getPageResult(page,pageable);
    }

}
