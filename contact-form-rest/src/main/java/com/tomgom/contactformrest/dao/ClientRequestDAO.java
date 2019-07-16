package com.tomgom.contactformrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomgom.contactformrest.model.ClientRequest;

@Repository
public interface ClientRequestDAO extends JpaRepository<ClientRequest, Integer>{
	
//	 List<ClientRequest> getAll();
	
//	public ClientRequest findById(int theId);
//	
//	public void saveClientRequest(ClientRequest theClientRequest);
//
//	public void deleteClientRequestById(int theId);
}
