package fr.hotel.services;

import java.util.List;

import fr.hotel.dto.AdminDTO;
import fr.hotel.dto.RolesDTO;

public interface AdminService {

	AdminDTO save(AdminDTO dto);

	AdminDTO findById(Integer id);

	List<AdminDTO> findAll();

	void delete(Integer id);

	AdminDTO findByUsername(String username);

	RolesDTO addRole (RolesDTO dto);

	List<AdminDTO> findAllAdminByIdRole(Integer idRole);

}
