package fr.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.hotel.controllers.api.RolesApi;
import fr.hotel.dto.RolesDTO;
import fr.hotel.services.RolesService;

@RestController
public class RolesController implements RolesApi{
	
	@Autowired
	RolesService rolesService;

	@Override
	public RolesDTO save(RolesDTO dto) {
		return rolesService.save(dto);
	}

	@Override
	public RolesDTO findById(Integer id) {
		return rolesService.findById(id);
	}

	@Override
	public List<RolesDTO> findAll() {
		return rolesService.findAll();
	}

	@Override
	public void delete(Integer id) {
		rolesService.delete(id);
		
	}

	@Override
	public RolesDTO findByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
