package br.com.adriano.desafio_todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br/com/adriano/desafio_todolist/entity")
public class DesafioTodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTodolistApplication.class, args);
	}

}
