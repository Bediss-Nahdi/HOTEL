package fr.hotel.controllers.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.hotel.dto.ClientDTO;

import static fr.hotel.utils.Constantes.APP_ROOT;

public interface ClientApi {
	@PostMapping(value = APP_ROOT + "/client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ClientDTO save(@RequestBody ClientDTO dto);

	@GetMapping(value = APP_ROOT + "/client/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	ClientDTO findById(@PathVariable("id") Integer id);

	@GetMapping(value = APP_ROOT + "/client/all", produces = MediaType.APPLICATION_JSON_VALUE)
	List<ClientDTO> findAll();

	@DeleteMapping(value = APP_ROOT + "/client/delete/{id}")
	void delete(@PathVariable("id") Integer id);
	
	
	ClientDTO findByNom (String nom);
	ClientDTO findByPrenom (String prenom);
	ClientDTO findByEmail (String email);
	ClientDTO findByTelephone (String telephone);
}
