package com.myUsers.test.controller;


import com.myUsers.test.bean.UsersDO;
import com.myUsers.test.service.IUsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author long_12360
 * @since 2020-10-23
 */
@RestController
@RequestMapping("//logs-do")
public class LogsController {

    private IUsersService iUsersService;

    @GetMapping
    public void usersList(){
        List<UsersDO> list = iUsersService.list();

        for (UsersDO usersDO : list) {
            Integer age = usersDO.getAge();
            System.out.println("年龄="+age);
        }

    }

    public void  deleteUsers(Integer id){

        boolean b = iUsersService.removeById(id);

    }

}
