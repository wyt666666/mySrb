package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.UserLoginRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户登录记录表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface UserLoginRecordService extends IService<UserLoginRecord> {

    /**
     * 登录日志数据
     * @param userId
     * @return
     */
    List<UserLoginRecord> listTop50(Long userId);
}
