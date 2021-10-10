package fr.hotel.controllers.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.hotel.dto.AdminDTO;
import fr.hotel.dto.RolesDTO;

import static fr.hotel.utils.Constantes.APP_ROOT;

public interface AdminApi {

	@PostMapping(value = APP_ROOT + "/administrateur/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	AdminDTO save(@RequestBody AdminDTO dto);

	
	
	@GetMapping(value = APP_ROOT + "/administrateur/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	AdminDTO findById(@PathVariable("id") Integer id);

	@GetMapping(value = APP_ROOT + "/administrateur/all", produces = MediaType.APPLICATION_JSON_VALUE)
	List<AdminDTO> findAll();

	
	@DeleteMapping(value = APP_ROOT + "/administrateur/delete/{id}")
	void delete(@PathVariable("id") Integer id);
	

	AdminDTO findByUsername(String username);

	RolesDTO addRole (RolesDTO dto);
	
	AdminDTO addRoleToUser(String username, String rolename);

	List<AdminDTO> findAllAdminByIdRole(Integer idRole);

}
