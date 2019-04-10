package br.com.unifacisa.arquitetura.prova1.Controle.de.Autor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ControleDeAutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDeAutorApplication.class, args);
	}

}
