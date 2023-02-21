package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.BorrowInfo;
import com.itcast.wuhan.pojo.entity.Lend;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.vo.BorrowInfoApprovalVO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标的准备表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface LendService extends IService<Lend> {

    //生成新标的
    void createLend(BorrowInfoApprovalVO borrowInfoApprovalVO, BorrowInfo borrowInfo);

    //查询标的列表
    List<Lend> selectList();

    //获取标的详情
    Map<String, Object> getLendDetail(Long id);

    //计算收益
    BigDecimal getInterestCount(BigDecimal invest, BigDecimal yearRate, Integer totalmonth, Integer returnMethod);

    //满标放款
    void makeLoan(Long id);
}
