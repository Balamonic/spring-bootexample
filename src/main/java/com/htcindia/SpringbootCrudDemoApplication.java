package com.htcindia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringbootCrudDemoApplication  extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootCrudDemoApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudDemoApplication.class, args);
	}
}
