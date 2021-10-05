package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hotel.entities.Roles;


@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
	Roles findByRole(String role);
}
