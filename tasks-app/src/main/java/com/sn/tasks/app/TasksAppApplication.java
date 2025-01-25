package com.sn.tasks.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sn.tasks.app")
public class TasksAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksAppApplication.class, args);
	}

}
