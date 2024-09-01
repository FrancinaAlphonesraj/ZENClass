package com.example.employee.employee.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
//@ComponentScan(basePackages = "com.example.employee.employee.Controller")
public class SwaggerConfig {
	
	@Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .pathsToMatch("/**","/swagger-ui/**", "/v3/api-docs/**")
                .build();
    }
//	 @Bean
//	    public OpenAPI customOpenAPI() {
//	        return new OpenAPI()
//	                .info(new Info()
//	                        .title("Employee Management API")
//	                        .version("1.0")
//	                        
//	                        .description("API documentation for the Employee Management System"));
//	    }
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.employee.employee.controller"))
                .paths(PathSelectors.any())
                .build();
    }
	 
	 
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry.addResourceHandler("swagger-ui.html")
	       .addResourceLocations("classpath:/META-INF/resources/");

	     registry.addResourceHandler("/webjars/**")
	       .addResourceLocations("classpath:/META-INF/resources/webjars/");
	 }

}
