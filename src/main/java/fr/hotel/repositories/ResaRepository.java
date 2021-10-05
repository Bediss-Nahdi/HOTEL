package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hotel.entities.Resa;

@Repository
public interface ResaRepository extends JpaRepository<Resa, Integer> {

}
