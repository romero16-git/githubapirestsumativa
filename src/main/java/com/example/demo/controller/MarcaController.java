package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Marca;
import com.example.demo.service.MarcaService;

@RestController
@RequestMapping("api/v1/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("")
	public ResponseEntity<List<Marca>> getAll(){
		List<Marca> marcas = new ArrayList<Marca>();
		marcaService.finAll().forEach(marcas::add);
		if(marcas.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	} else {
		return new ResponseEntity<>(marcas, HttpStatus.OK);
	}
		
}

 @PostMapping("")
 public ResponseEntity<Marca> create(@RequestBody Marca marca){
	 return new ResponseEntity<>(marcaService.save(marca), HttpStatus.CREATED);
	 
 }
 
 
 
 
}

