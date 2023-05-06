package com.chengma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author psh
 */
@EnableWebMvc
@MapperScan("com.chengma.mapper")
@SpringBootApplication
public class ChengmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChengmaApplication.class, args);
	}

}
