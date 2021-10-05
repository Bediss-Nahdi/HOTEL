package fr.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.hotel.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	 /* SELECT * FROM admin WHERE username = :username OR password = :password*/
	public Admin findByUsernameOrPassword(String username, String password);
}
