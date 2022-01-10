package com.devsup.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsup.client.entities.Client;
import com.devsup.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Client> findAll(){
		return repository.findAll();
		 
	}
	@Transactional(readOnly = true)
	public Client findById(Long id) {
	Optional<Client> obj = repository.findById(id);
	Client entity = obj.orElseThrow();
	return entity;
	}

}
