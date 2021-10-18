package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Marca;
import com.example.demo.repository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	public List<Marca> finAll(){
		return marcaRepository.findAll();
	}
	
	public Marca save (Marca marca) {
		return marcaRepository.save(marca);
	}

}
