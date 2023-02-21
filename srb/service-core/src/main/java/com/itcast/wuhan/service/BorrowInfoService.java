package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.BorrowInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.vo.BorrowInfoApprovalVO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 借款信息表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface BorrowInfoService extends IService<BorrowInfo> {

    //获取借款额度
    BigDecimal getBorrowAmount(Long userId);

    //借款信息列表
    List<BorrowInfo> selectList();

    //提交借款申请
    void saveBorrowInfo(BorrowInfo borrowInfo, Long userId);

    //获取借款申请审批状态
    Integer getStatusByUserId(Long userId);

    //获取借款信息
    Map<String, Object> getBorrowInfoDetail(Long id);

    //审批借款信息
    void approval(BorrowInfoApprovalVO borrowInfoApprovalVO);
}
