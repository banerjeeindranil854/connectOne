package com.webflux.connectOne.demo.config;


import com.webflux.connectOne.demo.v1.api.WebfluxApi;
import com.webflux.connectOne.demo.v2.DemoObjectController;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public GroupedOpenApi apiV2() {
        return GroupedOpenApi.builder()
                .group("v2")
                .packagesToScan(DemoObjectController.class.getPackageName())
                .build();
    }
    @Bean
    public GroupedOpenApi apiV1() {
        return GroupedOpenApi.builder()
                .group("v1")
                .packagesToScan(WebfluxApi.class.getPackageName())
                .build();
    }
}
