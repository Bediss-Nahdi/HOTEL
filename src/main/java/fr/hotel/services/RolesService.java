package fr.hotel.services;

import java.util.List;

import fr.hotel.dto.RolesDTO;

public interface RolesService {

	
	RolesDTO save(RolesDTO dto);

	RolesDTO findById(Integer id);

	List<RolesDTO> findAll();

	void delete(Integer id);
	
	RolesDTO findByRole(String role);
	
	
}
