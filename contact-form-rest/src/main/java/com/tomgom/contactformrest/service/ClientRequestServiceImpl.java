package com.tomgom.contactformrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomgom.contactformrest.dao.ClientRequestDAO;
import com.tomgom.contactformrest.model.ClientRequest;


@Service
public class ClientRequestServiceImpl implements ClientRequestService {
	
	// Temp static list of Requests
	private static List<ClientRequest> clientRequests = new ArrayList();
	private static int idCounter = 0;
	
	static {
		clientRequests.add(new ClientRequest(++idCounter, "John","Smith","john@cf.com","Address 1","333-444","Purpose of request 1"));
		clientRequests.add(new ClientRequest(++idCounter, "Jane","Jones","jane@cf.com","Address 2","444-555","Purpose of request 2"));
	}

	private ClientRequestDAO clientRequestDAO;
	
	@Autowired
	public ClientRequestServiceImpl(ClientRequestDAO theClientRequestDAO) {
		clientRequestDAO = theClientRequestDAO;
	}
	
	
	@Override
	@Transactional
	public List<ClientRequest> getAll() {
		// return clientRequestDAO.getAll();
		 return clientRequestDAO.findAll();
		 //return clientRequests; //tmp
	}

//	@Override
//	@Transactional
	public ClientRequest findById(int theId) {
		//return clientRequestDAO.findById(theId);

		return clientRequestDAO.findById(theId).get();
	
		//tmp
//		for(ClientRequest clientRequest : clientRequests) {
//			if(clientRequest.getId() == theId) {
//				return clientRequest;
//			}
//		}
//		return null;
		
	}

	@Override
	@Transactional
	public ClientRequest saveClientRequest(ClientRequest theClientRequest) {
		//clientRequestDAO.saveClientRequest(theClientRequest);
		
		clientRequestDAO.save(theClientRequest);
		//tmp
//		if(theClientRequest.getId()==0) {
//			theClientRequest.setId(++idCounter);
//			clientRequests.add(theClientRequest);
//		}
		return theClientRequest;
	}

	@Override
	@Transactional
	public void deleteClientRequestById(int theId) {
		//clientRequestDAO.deleteClientRequestById(theId);
		clientRequestDAO.deleteById(theId);
		
		//tmp
//		ClientRequest theClientRequest = findById(theId);
//		if(theClientRequest==null) return null;
		
//		if(clientRequests.remove(theClientRequest)) {
//			return theClientRequest;			
//		}
//		return null;

	}

}
