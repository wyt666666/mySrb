package com.itcast.wuhan.client;

import com.itcast.wuhan.client.fallback.CoreUserInfoClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-core", fallback = CoreUserInfoClientFallback.class) //指定yml中微服务的名称
public interface CoreUserInfoClient {

    /**
     * 校验手机号是否注册
     * @param mobile
     * @return
     */
    @GetMapping("/api/core/userInfo/checkMobile/{mobile}")
    boolean checkMobile(@PathVariable String mobile);

}
