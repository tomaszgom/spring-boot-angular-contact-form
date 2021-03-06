package com.tomgom.contactformrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomgom.contactformrest.model.ClientRequest;

@Repository
public interface ClientRequestRepository extends JpaRepository<ClientRequest, Integer>{
	
}
