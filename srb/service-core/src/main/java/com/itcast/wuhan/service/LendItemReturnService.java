package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.LendItemReturn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标的出借回款记录表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface LendItemReturnService extends IService<LendItemReturn> {

    //网站端显示回款计划
    List<LendItemReturn> selectByLendId(Long lendId, Long userId);

    //还款明细
    List<Map<String, Object>> addReturnDetail(Long lendReturnId);

    //根据还款计划id获取对应的回款计划列表
    List<LendItemReturn> selectLendItemReturnList(Long lendReturnId);
}
