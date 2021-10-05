package fr.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.hotel.controllers.api.AdminApi;
import fr.hotel.dto.AdminDTO;
import fr.hotel.dto.RolesDTO;
import fr.hotel.services.AdminService;

@RestController
public class AdminController implements AdminApi{

	@Autowired
	AdminService adminService;
	
	@Override
	public AdminDTO save(AdminDTO dto) {
		return adminService.save(dto);
	}

	
	@Override
	public AdminDTO findById(Integer id) {
		return adminService.findById(id);
	}

	@Override
	public List<AdminDTO> findAll() {
		return adminService.findAll();
	}

	@Override
	public void delete(Integer id) {
		adminService.delete(id);
		
	}

	@Override
	public AdminDTO findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RolesDTO addRole(RolesDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> findAllAdminByIdRole(Integer idRole) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
