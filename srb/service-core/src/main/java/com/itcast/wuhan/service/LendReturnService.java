package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.LendReturn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 还款记录表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface LendReturnService extends IService<LendReturn> {

    //管理端显示还款计划
    List<LendReturn> selectByLendId(Long lendId);

    //用户还款
    String commitReturn(Long lendReturnId, Long userId);

    //还款异步回调
    void notify(Map<String, Object> paramMap);
}
