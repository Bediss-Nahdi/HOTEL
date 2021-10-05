package fr.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.hotel.controllers.api.HotelApi;
import fr.hotel.dto.HotelDTO;
import fr.hotel.services.HotelService;

@RestController
public class HotelController implements HotelApi{

	@Autowired
	HotelService hotelService;
	
	@Override
	public HotelDTO save(HotelDTO dto) {
		return hotelService.save(dto);
	}

	@Override
	public HotelDTO findById(Integer id) {
		
		return hotelService.findById(id);
	}

	@Override
	public List<HotelDTO> findAll() {
		return hotelService.findAll();
	}

	@Override
	public void delete(Integer id) {
		hotelService.delete(id);
		
	}

	@Override
	public HotelDTO findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelDTO findByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelDTO findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelDTO findByTelephone(String telephone) {
		// TODO Auto-generated method stub
		return null;
	}

}
