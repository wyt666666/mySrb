package com.itcast.wuhan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.entity.UserBind;
import com.itcast.wuhan.pojo.vo.UserBindVO;

import java.util.Map;

/**
 * <p>
 * 用户绑定表 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface UserBindService extends IService<UserBind> {

    /**
     * 账户绑定提交到托管平台的数据
     */
    String commitBindUser(UserBindVO userBindVO, Long userId);

    /**
     * 修改账户绑定状态
     * @param paramMap
     */
    void notify(Map<String, Object> paramMap);

    //根据用户ID获取绑定码
    String getBindCodeByUserId(Long investUserId);
}
