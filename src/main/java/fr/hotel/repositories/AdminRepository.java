package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hotel.dto.AdminDTO;
import fr.hotel.entities.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	 /* SELECT * FROM admin WHERE username = :username OR password = :password*/
	public Admin findByUsernameOrPassword(String username, String password);
}
