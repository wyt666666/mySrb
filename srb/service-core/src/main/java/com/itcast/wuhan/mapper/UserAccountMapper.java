package com.itcast.wuhan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itcast.wuhan.pojo.entity.UserAccount;
import feign.Param;

import java.math.BigDecimal;

/**
 * <p>
 * 用户账户 Mapper 接口
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    //更新账户
    void updateAccount(
            @Param("bindCode")String bindCode,
            @Param("amount") BigDecimal amount,
            @Param("freezeAmount")BigDecimal freezeAmount);
}
