package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.BorrowerAttach;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.vo.BorrowerAttachVO;

import java.util.List;

/**
 * <p>
 * 借款人上传资源表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface BorrowerAttachService extends IService<BorrowerAttach> {

    //通过用户ID获取借款人的附件信息
    List<BorrowerAttachVO> selectBorrowerAttachVOList(Long id);
}
