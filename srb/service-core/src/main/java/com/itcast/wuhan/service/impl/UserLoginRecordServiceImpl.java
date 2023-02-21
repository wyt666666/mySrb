package com.itcast.wuhan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcast.wuhan.pojo.entity.UserLoginRecord;
import com.itcast.wuhan.mapper.UserLoginRecordMapper;
import com.itcast.wuhan.service.UserLoginRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

    @Override
    public List<UserLoginRecord> listTop50(Long userId) {
        QueryWrapper<UserLoginRecord> userLoginRecordQueryWrapper = new QueryWrapper<>();
        userLoginRecordQueryWrapper
                .eq("user_id", userId)
                .orderByDesc("id")
                .last("limit 50");
        List<UserLoginRecord> userLoginRecords = baseMapper.selectList(userLoginRecordQueryWrapper);
        return userLoginRecords;
    }
}
