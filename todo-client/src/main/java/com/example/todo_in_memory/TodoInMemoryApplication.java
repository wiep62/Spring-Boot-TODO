package com.example.todo_in_memory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoInMemoryApplication {
//todo лишние зависимости могут мешать запуску программы!!!
	public static void main(String[] args) {
		SpringApplication.run(TodoInMemoryApplication.class, args);
	}

}
