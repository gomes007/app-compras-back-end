package com.example.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.domain.Cliente;
import com.example.cursomc.repositories.ClienteRepository;
import com.example.cursomc.services.exceptions.ObjctNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);		
		return obj.orElseThrow(()-> new ObjctNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}

}