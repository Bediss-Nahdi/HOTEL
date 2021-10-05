package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hotel.entities.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {

}
