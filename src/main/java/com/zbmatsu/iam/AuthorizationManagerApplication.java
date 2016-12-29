package com.zbmatsu.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.zbmatsu.iam.configuration.CustomConfigBean;


@SpringBootApplication
@EnableConfigurationProperties({CustomConfigBean.class})
public class AuthorizationManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationManagerApplication.class, args);
	}
}
