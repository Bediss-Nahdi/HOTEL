package fr.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hotel.dto.AdminDTO;
import fr.hotel.dto.RolesDTO;
import fr.hotel.entities.Admin;
import fr.hotel.repositories.AdminRepository;
import fr.hotel.services.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public AdminDTO save(AdminDTO dto) {
		return AdminDTO.fromEntity(adminRepository.save(AdminDTO.toEntity(dto)));
	}

	@Override
	public AdminDTO findById(Integer id) {
		
		Optional<Admin> admin = adminRepository.findById(id);
		
		AdminDTO dto = AdminDTO.fromEntity(admin.get());
		
		return Optional.of(dto).orElseThrow(()-> new EntityNotFoundException("Il n'y a pas cette administrateur dans la BDD"));
	}
	
	
	@Override
	public List<AdminDTO> findAll() {
		return adminRepository.findAll().stream()
		        .map(AdminDTO::fromEntity)
		        .collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		
		adminRepository.deleteById(id);
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
