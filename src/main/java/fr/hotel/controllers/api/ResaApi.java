package fr.hotel.controllers.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static fr.hotel.utils.Constantes.APP_ROOT;

import fr.hotel.dto.ResaDTO;

public interface ResaApi {
	@PostMapping(value = APP_ROOT + "/reservation/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResaDTO save(@RequestBody  ResaDTO dto) ;

	@GetMapping(value = APP_ROOT + "/reservation/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	ResaDTO findById( @PathVariable("id") Integer id) ;

	@GetMapping(value = APP_ROOT + "/reservation/all", produces = MediaType.APPLICATION_JSON_VALUE)
	List<ResaDTO> findAll() ;

	@DeleteMapping(value = APP_ROOT + "/reservation/delete/{id}")
	void delete(@PathVariable("id") Integer id) ;

}
