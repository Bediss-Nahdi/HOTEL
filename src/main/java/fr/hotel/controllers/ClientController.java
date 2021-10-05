package fr.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.hotel.controllers.api.ClientApi;
import fr.hotel.dto.ClientDTO;
import fr.hotel.services.ClientService;

@RestController
public class ClientController implements ClientApi{
	
	@Autowired
	ClientService clientService;

	@Override
	public ClientDTO save(ClientDTO dto) {
		return clientService.save(dto);
	}

	@Override
	public ClientDTO findById(Integer id) {
		return clientService.findById(id);
	}

	@Override
	public List<ClientDTO> findAll() {
		return clientService.findAll();
	}

	@Override
	public void delete(Integer id) {
		clientService.delete(id);
		
	}

	@Override
	public ClientDTO findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDTO findByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDTO findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDTO findByTelephone(String telephone) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
