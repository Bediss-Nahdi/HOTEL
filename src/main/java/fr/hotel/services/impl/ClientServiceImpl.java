package fr.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hotel.dto.ClientDTO;
import fr.hotel.entities.Client;
import fr.hotel.repositories.ClientRepository;
import fr.hotel.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepository;

	@Override
	public ClientDTO save(ClientDTO dto) {
		return ClientDTO.fromEntity(clientRepository.save(ClientDTO.toEntity(dto)));
	}


	
	@Override
	public ClientDTO findById(Integer id) {
		
		Optional<Client> client = clientRepository.findById(id);

		ClientDTO dto = ClientDTO.fromEntity(client.get());

		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException("Il n'y a pas ce client dans la BDD"));
		
	}

	@Override
	public List<ClientDTO> findAll() {
		return clientRepository.findAll().stream()
		        .map(ClientDTO::fromEntity)
		        .collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		clientRepository.deleteById(id);

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
