package com.hchcc.miaoshaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MiaoshaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoshaDemoApplication.class, args);
	}

}
