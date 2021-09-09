package com.arq.microservice.demonioDaCapivara;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoniodacapivara")
public class DemonioDaCapivaraController {

	@GetMapping
	public List<DemonioDaCapivara> findAll() {
		return new ArrayList<DemonioDaCapivara>();
	}
}
