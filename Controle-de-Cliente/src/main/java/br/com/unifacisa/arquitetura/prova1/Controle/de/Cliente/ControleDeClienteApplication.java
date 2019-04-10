package br.com.unifacisa.arquitetura.prova1.Controle.de.Cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ControleDeClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDeClienteApplication.class, args);
	}

}
