package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("nacos")
//获取配置中的config
public class NacosController {


    //动态获取配置
    @Value("${server.port}")
    private String config;

    @GetMapping("index")
    public String index() {
        return config;
    }

}
