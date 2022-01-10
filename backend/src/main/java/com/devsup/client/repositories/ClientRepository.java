package com.devsup.client.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
