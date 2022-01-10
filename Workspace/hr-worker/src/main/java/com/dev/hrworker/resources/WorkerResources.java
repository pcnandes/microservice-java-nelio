package com.dev.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.hrworker.entities.Worker;
import com.dev.hrworker.repositories.WorkerRepository;

// anotacao usada pelo Actuator para atualizar as configuracoes sem precisar reiniciar o servidor
@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerResources.class);
	
//	@Value("${test.config}")
//	private String testConfig;

	@Autowired
	// tem informacoes do contexto
	private Environment env;
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfig() {
//		logger.info("CONFIG = "+ testConfig);
		return ResponseEntity.noContent().build();	}
	
	
	@GetMapping
	public ResponseEntity<List<Worker>> fildAll() {
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		logger.info("PORT = "+ env.getProperty("local.server.port"));
		
		Optional<Worker> obj = repository.findById(id);
		return ResponseEntity.ok(obj.orElse(null));
	}

}
