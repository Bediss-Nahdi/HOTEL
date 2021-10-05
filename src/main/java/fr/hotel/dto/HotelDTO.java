package fr.hotel.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.hotel.entities.Hotel;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class HotelDTO {

	private long id;
	
	private String nom;

	
	private Integer etoiles;

	
	private AdresseDTO adresse;

	
	private String telephone;


	private String email;

	// Ce qui a été modifié % à l'exo
	// private String adresse;
	// private Ville ville;

	 @JsonIgnore
	private List<ResaDTO> resa;
	
	
	// Méthodes à partir d'une entité/class je construit mon DTO
	public static HotelDTO fromEntity (Hotel hotel) {
		if(hotel ==null) {
			//On lève une exception
			return null;
		}
		//Si tout va bien je construit mon objet
		// MAPPING Hotel ====>  HotelDTO
		return HotelDTO.builder()
		        .id(hotel.getHotel_id())
		        .nom(hotel.getNom())
		        .etoiles(hotel.getEtoiles())
		        .telephone(hotel.getTelephone())
		        .email(hotel.getEmail())
		        .build();
	}
	
	// Chemin inverse    MAPPING HotelDTO ====>  Hotel
	public static Hotel toEntity (HotelDTO hotelDto) {
		if(hotelDto ==null) {
			//On lève une exception
			return null;
		}
		
		 
		Hotel hotel = new Hotel();
		hotel.setHotel_id(hotelDto.getId());
		hotel.setNom(hotelDto.getNom());
		hotel.setEtoiles(hotelDto.getEtoiles());
		hotel.setTelephone(hotelDto.getTelephone());
		hotel.setEmail(hotelDto.getEmail());
		
		
		return hotel;
	}
	
	
	
	
	
}
