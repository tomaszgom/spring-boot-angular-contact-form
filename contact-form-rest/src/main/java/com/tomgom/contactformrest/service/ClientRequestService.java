package com.tomgom.contactformrest.service;

import java.util.List;

import com.tomgom.contactformrest.model.ClientRequest;

public interface ClientRequestService {
	
	public List<ClientRequest> getAll();
	
	public ClientRequest findById(int theId);
	
	public ClientRequest saveClientRequest(ClientRequest theClientRequest);

	public void deleteClientRequestById(int theId);

}
