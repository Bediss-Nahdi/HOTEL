package fr.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.hotel.controllers.api.ResaApi;
import fr.hotel.dto.ResaDTO;
import fr.hotel.services.ResaService;

@RestController
public class ResaController implements ResaApi{

	@Autowired
	ResaService resaService;
	
	@Override
	public ResaDTO save(ResaDTO dto) {
		return resaService.save(dto);
	}

	@Override
	public ResaDTO findById(Integer id) {
		return resaService.findById(id);
	}

	@Override
	public List<ResaDTO> findAll() {
		return resaService.findAll();
	}

	@Override
	public void delete(Integer id) {
		resaService.delete(id);
		
	}

}
