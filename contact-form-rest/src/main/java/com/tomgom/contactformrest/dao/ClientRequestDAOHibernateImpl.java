package com.tomgom.contactformrest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tomgom.contactformrest.model.ClientRequest;


/**
 * 
 * Client Request Data Access Object implementation Repository
 * 
 *
 */

@Repository
public class ClientRequestDAOHibernateImpl {//implements ClientRequestDAO {
	
	private EntityManager entityManager;

	@Autowired
	public ClientRequestDAOHibernateImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	//@Override
	public List<ClientRequest> getAll() {
		
		// Get current Hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<ClientRequest> theQuery = currentSession.createQuery("from ClientRequest", ClientRequest.class);
		
		List<ClientRequest> clientRequest = theQuery.getResultList();
		
		return clientRequest;
	}

	//@Override
	public ClientRequest findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		ClientRequest theClientRequest = currentSession.get(ClientRequest.class, theId);
		return theClientRequest;
	}

	//@Override
	public void saveClientRequest(ClientRequest theClientRequest) {
		Session currentSession = entityManager.unwrap(Session.class);	
		currentSession.saveOrUpdate(theClientRequest);		
	}

	//@Override
	public void deleteClientRequestById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);		
		Query theQuery = currentSession.createNamedQuery(
				"delete from ClientRequest where id=:clientRequestId");
		theQuery.setParameter("clientRequestId", theId);
	}

}
