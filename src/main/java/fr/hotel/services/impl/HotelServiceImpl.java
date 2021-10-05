package fr.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hotel.dto.HotelDTO;
import fr.hotel.entities.Hotel;
import fr.hotel.repositories.HotelRepository;
import fr.hotel.services.HotelService;


@Service
public class HotelServiceImpl implements HotelService{

	
	@Autowired
	HotelRepository hotelReposity;
	
	
	@Override
	public HotelDTO save(HotelDTO dto) {
		return HotelDTO.fromEntity(hotelReposity.save(HotelDTO.toEntity(dto)));
	}

	@Override
	public HotelDTO findById(Integer id) {
		Optional<Hotel> hotel = hotelReposity.findById(id);

		HotelDTO dto = HotelDTO.fromEntity(hotel.get());

		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException("Il n'y a pas cet Hôtel dans la BDD"));
	}

	@Override
	public List<HotelDTO> findAll() {
		return hotelReposity.findAll().stream()
		        .map(HotelDTO::fromEntity)
		        .collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		hotelReposity.deleteById(id);
		
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
