package com.techstore.techstore.DAO;

import com.techstore.techstore.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
