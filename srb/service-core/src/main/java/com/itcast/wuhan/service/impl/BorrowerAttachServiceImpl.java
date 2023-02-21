package com.itcast.wuhan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itcast.wuhan.pojo.entity.BorrowerAttach;
import com.itcast.wuhan.pojo.vo.BorrowerAttachVO;
import com.itcast.wuhan.mapper.BorrowerAttachMapper;
import com.itcast.wuhan.service.BorrowerAttachService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 借款人上传资源表 服务实现类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
@Service
public class BorrowerAttachServiceImpl extends ServiceImpl<BorrowerAttachMapper, BorrowerAttach> implements BorrowerAttachService {

    /**
     * 通过用户ID获取借款人的附件信息
     * @param borrowerId
     * @return
     */
    @Override
    public List<BorrowerAttachVO> selectBorrowerAttachVOList(Long borrowerId) {

        QueryWrapper<BorrowerAttach> borrowerAttachQueryWrapper = new QueryWrapper<>();
        borrowerAttachQueryWrapper.eq("borrower_id", borrowerId);
        List<BorrowerAttach> borrowerAttachList = baseMapper.selectList(borrowerAttachQueryWrapper);

        //将附件放入VO数据对象中
        List<BorrowerAttachVO> borrowerAttachVOList = new ArrayList<>();
        borrowerAttachList.forEach(borrowerAttach -> {
            BorrowerAttachVO borrowerAttachVO = new BorrowerAttachVO();
            borrowerAttachVO.setImageType(borrowerAttach.getImageType());
            borrowerAttachVO.setImageUrl(borrowerAttach.getImageUrl());

            borrowerAttachVOList.add(borrowerAttachVO);
        });

        return borrowerAttachVOList;
    }

}
