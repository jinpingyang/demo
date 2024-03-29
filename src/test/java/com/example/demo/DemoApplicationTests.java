package com.example.demo;

import com.example.demo.dto.PageUtils;
import com.example.demo.dto.ResponseResult;
import com.example.demo.dto.ResponseResultDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import sun.text.normalizer.UnicodeSet;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
//        User user=new User();
//        user.setNo("001");
//        user.setName("zhangsan");
//        user.setStatus(1L);
//        user.setPassWord("123456");
//        userService.addUser(user);

        Pageable pageable = PageUtils.initPageRequest(1,1,false,"id",null);
       ResponseResultDto responseResultDto=ResponseResult.createSuccessResultWithData(userService.findByall(pageable));
        System.out.println(responseResultDto.getCode());
        System.out.println(responseResultDto.getData());
    }

}
