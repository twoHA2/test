package com.atguigu.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "microservicecloud-sidecar-python")
public interface PythonClientService {
    @RequestMapping(value = "/getUser")
    public String getUser();
}
