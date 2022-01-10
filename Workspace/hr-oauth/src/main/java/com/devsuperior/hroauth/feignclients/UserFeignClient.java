package com.devsuperior.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsuperior.hroauth.entities.User;

@Component
// nome do microservico q ele vai se comunicar
@FeignClient(name="hr-user", path="/users")
public interface UserFeignClient {

	
	// é necessario uma assinatura de metodo semelhante ao servico q quero acessar
	@GetMapping(value = "/search")
	ResponseEntity<User> fildByEmail(@RequestParam String email);
}
