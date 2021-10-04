package fr.hotel.dto;

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
	
	
	private String username;

	
	private String password;
}
