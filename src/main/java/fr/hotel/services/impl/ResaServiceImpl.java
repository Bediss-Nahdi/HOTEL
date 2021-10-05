package fr.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hotel.dto.ResaDTO;
import fr.hotel.entities.Resa;
import fr.hotel.repositories.ResaRepository;
import fr.hotel.services.ResaService;


@Service
public class ResaServiceImpl implements ResaService{

	
	@Autowired
	ResaRepository resaRepository; ;
	
	
	@Override
	public ResaDTO save(ResaDTO dto) {
		return ResaDTO.fromEntity(resaRepository.save(ResaDTO.toEntity(dto)));
	}

	@Override
	public ResaDTO findById(Integer id) {
		Optional<Resa> hotel = resaRepository.findById(id);

		ResaDTO dto = ResaDTO.fromEntity(hotel.get());

		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException("Il n'y a pas cette réservation dans la BDD"));
	}

	@Override
	public List<ResaDTO> findAll() {
		return resaRepository.findAll().stream()
		        .map(ResaDTO::fromEntity)
		        .collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		resaRepository.deleteById(id);
		
	}

}
