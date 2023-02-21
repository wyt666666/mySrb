package com.itcast.wuhan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.bo.TransFlowBO;
import com.itcast.wuhan.pojo.entity.TransFlow;

import java.util.List;

/**
 * <p>
 * 交易流水表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface TransFlowService extends IService<TransFlow> {

    //保存交易流水业务
    void saveTransFlow(TransFlowBO transFlowBO);

    //判断流水是否存在
    boolean isSaveTransFlow(String agentBillNo);

    //获取列表
    List<TransFlow> selectByUserId(Long userId);
}
