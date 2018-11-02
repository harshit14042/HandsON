package com.example.demo.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurationSupport{

	@Bean
    public Docket apiDocket() {
        /*return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.ant("/v2/**"))
                .build()
                .apiInfo(getApiInfo());*/
		return new Docket(DocumentationType.SWAGGER_2) .select() .apis(RequestHandlerSelectors.basePackage(("com.example.demo"))) .paths(Predicates.or( /*PathSelectors.regex("/all"),PathSelectors.regex("/update"),PathSelectors.regex("/create"),*/PathSelectors.regex("/.*"))) .build() .pathMapping("/").apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Basic Rest APIs",
                "Spring Boot app with Swagger",
                "1.0.0",
                "",
                new Contact("Harshit Verma", "", ""),
                "",
                "",
                Collections.emptyList()
        );
    }
    
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
 
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

	
	
	 /*private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot REST API",
	                "Spring Boot REST API for Online Store",
	                "1.0",
	                "Terms of service",
	                new Contact("John Thompson", "https://springframework.guru/about/", "john@springfrmework.guru"),
	               "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	    }*/
	
//	 @Bean
//	    public Docket productApi() {
//	        return new Docket(DocumentationType.SWAGGER_2)
//	                .select().apis(RequestHandlerSelectors.any())
//	                .paths(PathSelectors.any())
//	                .build();
		 
//		 return new Docket(DocumentationType.SWAGGER_2)
//	                .select()                 .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
//	                .paths(regex("/rest/*"))
//	                .build().apiInfo(metaData());
//		 
//		 return new Docket(DocumentationType.SWAGGER_2)
//	                .select()
//	                    .apis(RequestHandlerSelectors.any())
//	                    .paths(PathSelectors.any())
//	                    // .paths(regex("/api/*"))
//	                    .build();
//		 return new Docket(DocumentationType.SWAGGER_2).forCodeGeneration(true)
//	                            .genericModelSubstitutes(ResponseEntity.class)
//	                            .select()
//	                            .paths(PathSelectors.regex("/api/.*"))
//	                            .build().directModelSubstitute(LocalDate.class,String.class)
//	                            .genericModelSubstitutes(ResponseEntity.class);
	                //.pathMapping("/")
	                //.apiInfo(metaData());
	    }

	             
	    
//	  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//	        registry.addResourceHandler("swagger-ui.html")
//	                .addResourceLocations("classpath:/META-INF/resources/");
//	 
//	        registry.addResourceHandler("/webjars/**")
//	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//	    }
	

