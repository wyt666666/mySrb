package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.UserAccount;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.Map;

/**
 * <p>
 * 用户账户 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface UserAccountService extends IService<UserAccount> {

    //充值
    String commitCharge(BigDecimal chargeAmt, Long userId);

    //定义回调接口
    String notify(Map<String, Object> paramMap);

    //账户余额信息接口
    BigDecimal getAccount(Long userId);

    //提现
    String commitWithdraw(BigDecimal fetchAmt, Long userId);

    //用户提现异步回调
    void notifyWithdraw(Map<String, Object> paramMap);
}
