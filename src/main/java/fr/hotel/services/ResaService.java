package fr.hotel.services;

import java.util.List;

import fr.hotel.dto.ResaDTO;

public interface ResaService {
	ResaDTO save(ResaDTO dto) ;

	ResaDTO findById(Integer id) ;

	List<ResaDTO> findAll() ;

	void delete(Integer id) ;
}
