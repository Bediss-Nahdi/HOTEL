package fr.hotel.services;

import java.util.List;

import fr.hotel.dto.HotelDTO;

public interface HotelService {

	
	HotelDTO save(HotelDTO dto);

	HotelDTO findById(Integer id);

	List<HotelDTO> findAll();

	void delete(Integer id);
	
	
	HotelDTO findByNom (String nom);
	HotelDTO findByPrenom (String prenom);
	HotelDTO findByEmail (String email);
	HotelDTO findByTelephone (String telephone);
	
}
