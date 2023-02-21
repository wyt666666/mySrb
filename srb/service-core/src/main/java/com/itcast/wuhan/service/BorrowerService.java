package com.itcast.wuhan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itcast.wuhan.pojo.entity.Borrower;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.vo.BorrowerApprovalVO;
import com.itcast.wuhan.pojo.vo.BorrowerDetailVO;
import com.itcast.wuhan.pojo.vo.BorrowerVO;

/**
 * <p>
 * 借款人 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface BorrowerService extends IService<Borrower> {

    //传输借款人VO对象数据
    void saveBorrowerVOByUserId(BorrowerVO borrowerVO, Long userId);

    //获取借款人状态
    Integer getStatusByUserId(Long userId);

    //借款列表展示
    IPage<Borrower> listPage(Page<Borrower> pageParam, String keyword);

    //借款人信息展示
    BorrowerDetailVO getBorrowerDetailVOById(Long id);

    //借款额度审核
    void approval(BorrowerApprovalVO borrowerApprovalVO);
}
