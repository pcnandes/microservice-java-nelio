package com.dev.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//permite reiniciar um servico em caso de falha
@EnableCircuitBreaker
@EnableEurekaClient
// habilita o Feing -> faz a comunicacao entre os projetos
@EnableFeignClients
// indica q seremos cliente do ribbon (balanceador de carga)
// @RibbonClient(name="hr-worker")
@SpringBootApplication
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
