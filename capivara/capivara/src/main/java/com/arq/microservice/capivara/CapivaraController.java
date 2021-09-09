package com.arq.microservice.capivara;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/capivara")
public class CapivaraController {

	@GetMapping
	public List<Capivara> findAll() {
		return new ArrayList<Capivara>();
	}
}
