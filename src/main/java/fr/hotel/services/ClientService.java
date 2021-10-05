package fr.hotel.services;

import java.util.List;

import fr.hotel.dto.ClientDTO;

public interface ClientService {

	ClientDTO save(ClientDTO dto);

	ClientDTO findById(Integer id);

	List<ClientDTO> findAll();

	void delete(Integer id);
	
	ClientDTO findByNom (String nom);
	ClientDTO findByPrenom (String prenom);
	ClientDTO findByEmail (String email);
	ClientDTO findByTelephone (String telephone);
}
