package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hotel.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
