package fr.hotel.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class HotelDTO {

	private long id;
	
	private String nom;

	
	private int etoiles;

	
	private AdresseDTO adresse;

	
	private String telephone;


	private String email;

	// Ce qui a été modifié % à l'exo
	// private String adresse;
	// private Ville ville;

	
	private List<ResaDTO> resa;
}
