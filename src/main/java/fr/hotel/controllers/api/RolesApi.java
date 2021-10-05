package fr.hotel.controllers.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.hotel.dto.RolesDTO;
import static fr.hotel.utils.Constantes.APP_ROOT;

public interface RolesApi {

	@PostMapping(value = APP_ROOT + "/role/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	RolesDTO save(@RequestBody  RolesDTO dto);

	@GetMapping(value = APP_ROOT + "/role/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	RolesDTO findById( @PathVariable("id") Integer id);

	@GetMapping(value = APP_ROOT + "/role/all", produces = MediaType.APPLICATION_JSON_VALUE)
	List<RolesDTO> findAll();

	@DeleteMapping(value = APP_ROOT + "/role/delete/{id}")
	void delete(@PathVariable("id") Integer id);
	
	RolesDTO findByRole(String role);
}
