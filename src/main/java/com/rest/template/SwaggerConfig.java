package com.rest.template;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rest.template"))
                .paths(PathSelectors.any())
                .build().apiInfo(getApiInfo());

        return docket;

    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Sample Rest Template",
                "Template to bootstrap a spring boot development process",
                "1.0.0",
                null,
                null,
                null,
                null,
                Collections.emptyList()
        );
    }
}