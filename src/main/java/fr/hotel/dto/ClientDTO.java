package fr.hotel.dto;

import fr.hotel.entities.Client;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ClientDTO {

	
	private long id;


	private String nom;


	private String prenom;

//	@Column(name = "mot_de_passe")
//	private String moteDePasse;

	
	private AdresseDTO adresse;

	private String photo;

	
	private String email;

	
	private String telephone;

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
//	private List<Resa> resa;
	
	
//	private String username;
//
//	
//	private String password;
	
	
	public static ClientDTO fromEntity(Client client) {
	    if (client == null) {
	      return null;
	    }
	    return ClientDTO.builder()
	        .id(client.getClient_id())
	        .nom(client.getNom())
	        .prenom(client.getPrenom())
	        .adresse(AdresseDTO.fromEntity(client.getAdresse()))
	        .photo(client.getPhoto())
	        .email(client.getEmail())
	        .telephone(client.getTelephone())
	        .build();
	  }

	  public static Client toEntity(ClientDTO dto) {
	    if (dto == null) {
	      return null;
	    }
	    Client client = new Client();
	    client.setClient_id(dto.getId());
	    client.setNom(dto.getNom());
	    client.setPrenom(dto.getPrenom());
	    client.setAdresse(AdresseDTO.toEntity(dto.getAdresse()));
	    client.setPhoto(dto.getPhoto());
	    client.setEmail(dto.getEmail());
	    client.setTelephone(dto.getTelephone());
	    
	    return client;
	  }
}
