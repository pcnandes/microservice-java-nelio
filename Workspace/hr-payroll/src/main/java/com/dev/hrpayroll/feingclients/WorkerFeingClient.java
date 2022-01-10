package com.dev.hrpayroll.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.hrpayroll.entities.Worker;

// declara o tipo de chamada web service1
@Component
//@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeingClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
