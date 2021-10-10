package fr.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fr.hotel.repositories.AdminRepository;
import fr.hotel.services.AdminService;

@SpringBootApplication
public class HotelApplication {

	@Autowired
	AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);

	}
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

	
}
