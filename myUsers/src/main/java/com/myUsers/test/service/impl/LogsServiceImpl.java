package com.myUsers.test.service.impl;

import com.myUsers.test.bean.LogsDO;
import com.myUsers.test.mapper.ILogsMapper;
import com.myUsers.test.service.ILogsService;
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
public class LogsServiceImpl extends ServiceImpl<ILogsMapper, LogsDO> implements ILogsService {

}
