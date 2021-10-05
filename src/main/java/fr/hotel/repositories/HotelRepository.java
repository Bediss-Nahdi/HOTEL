package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
