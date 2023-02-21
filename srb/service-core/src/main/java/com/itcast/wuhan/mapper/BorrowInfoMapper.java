package com.itcast.wuhan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itcast.wuhan.pojo.entity.BorrowInfo;

import java.util.List;

/**
 * <p>
 * 借款信息表 Mapper 接口
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface BorrowInfoMapper extends BaseMapper<BorrowInfo> {

    //借款信息列表
    List<BorrowInfo> selectBorrowInfoList();


}
