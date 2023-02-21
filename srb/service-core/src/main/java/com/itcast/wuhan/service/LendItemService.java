package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.LendItem;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.vo.InvestVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标的出借记录表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface LendItemService extends IService<LendItem> {

    //投标
    String commitInvest(InvestVO investVO);

    //回调接口
    void notify(Map<String, Object> paramMap);

    //根据lendId获取投资记录
    List<LendItem> selectByLendId(Long lendId, Integer status);

    //管理端显示投资记录
    List<LendItem> selectByLendId(Long lendId);
}
