package fr.hotel.controllers.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.hotel.dto.HotelDTO;

import static fr.hotel.utils.Constantes.APP_ROOT;


public interface HotelApi {
	@PostMapping(value = APP_ROOT + "/hotel/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	HotelDTO save( @RequestBody HotelDTO dto);

	@GetMapping(value = APP_ROOT + "/hotel/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	HotelDTO findById( @PathVariable("id") Integer id);

	@GetMapping(value = APP_ROOT + "/hotel/all", produces = MediaType.APPLICATION_JSON_VALUE)
	List<HotelDTO> findAll();

	@DeleteMapping(value = APP_ROOT + "/hotel/delete/{id}")
	void delete(@PathVariable("id") Integer id);
	
	
	HotelDTO findByNom (String nom);
	HotelDTO findByPrenom (String prenom);
	HotelDTO findByEmail (String email);
	HotelDTO findByTelephone (String telephone);
}
