package com.myUsers.test.service.impl;

import com.myUsers.test.bean.UsersDO;
import com.myUsers.test.mapper.IUsersMapper;
import com.myUsers.test.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author long_12360
 * @since 2020-10-23
 */
@Service
public class UsersServiceImpl extends ServiceImpl<IUsersMapper, UsersDO> implements IUsersService {

}
