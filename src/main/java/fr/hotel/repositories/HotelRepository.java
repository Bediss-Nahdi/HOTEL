package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hotel.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
