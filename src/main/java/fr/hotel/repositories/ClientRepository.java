package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hotel.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
