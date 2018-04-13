package br.com.andre.endpoint;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.model.Estudante;

@RestController
@RequestMapping("estudante")
public class EstudanteEndPoint {
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Estudante> listAll(){
		return Arrays.asList(new Estudante("Andre"), new Estudante("Apoh"), new Estudante("Pedro"));
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/teste")
	public String teste() {
		return "<h1> teste de titulo </h1>";
	}
}
