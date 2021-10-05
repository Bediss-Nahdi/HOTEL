package fr.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hotel.dto.RolesDTO;
import fr.hotel.entities.Roles;
import fr.hotel.repositories.RolesRepository;
import fr.hotel.services.RolesService;


@Service
public class RolesServiceImpl implements  RolesService{

	@Autowired
	RolesRepository rolesRepository;
	
	@Override
	public RolesDTO save(RolesDTO dto) {
		return RolesDTO.fromEntity(rolesRepository.save(RolesDTO.toEntity(dto)));
	}

	@Override
	public RolesDTO findById(Integer id) {
		Optional<Roles> hotel = rolesRepository.findById(id);
		RolesDTO dto = RolesDTO.fromEntity(hotel.get());
		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException("Il n'y a pas ce rôle dans la BDD"));
	}

	@Override
	public List<RolesDTO> findAll() {
		return rolesRepository.findAll().stream()
		        .map(RolesDTO::fromEntity)
		        .collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		rolesRepository.deleteById(id);
		
	}

	@Override
	public RolesDTO findByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
