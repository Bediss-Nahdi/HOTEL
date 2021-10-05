package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hotel.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
