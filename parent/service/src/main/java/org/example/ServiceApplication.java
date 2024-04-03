package org.example;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author oook
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "org.example.mapper")
public class ServiceApplication {
    /**
     * 启动入口
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            SpringApplication.run(ServiceApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 分页拦截器
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}