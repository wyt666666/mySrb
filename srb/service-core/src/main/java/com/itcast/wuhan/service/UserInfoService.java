package com.itcast.wuhan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.entity.UserInfo;
import com.itcast.wuhan.pojo.query.UserInfoQuery;
import com.itcast.wuhan.pojo.vo.LoginVO;
import com.itcast.wuhan.pojo.vo.RegisterVO;
import com.itcast.wuhan.pojo.vo.UserIndexVO;
import com.itcast.wuhan.pojo.vo.UserInfoVO;

/**
 * <p>
 * 用户基本信息 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface UserInfoService extends IService<UserInfo> {

    /**
     * 注册会员
     * @param registerVO
     */
    void register(RegisterVO registerVO);

    /**
     * 会员登录
     * @param loginVO
     * @param ip
     * @return
     */
    UserInfoVO login(LoginVO loginVO, String ip);

    /**
     * 分页查询
     * @param pageParam
     * @param userInfoQuery
     * @return
     */
    IPage<UserInfo> listPage(Page<UserInfo> pageParam, UserInfoQuery userInfoQuery);

    /**
     * 根据id修改用户状态
     * @param id
     * @param status
     */
    void lock(Long id, Integer status);

    /**
     * 在发短信前校验手机号是否已注册
     * @param mobile
     * @return
     */
    boolean checkMobile(String mobile);

    //获取个人空间用户信息
    UserIndexVO getIndexUserInfo(Long userId);

    //根据bindCode获取手机号
    String getMobileByBindCode(String bindCode);
}
