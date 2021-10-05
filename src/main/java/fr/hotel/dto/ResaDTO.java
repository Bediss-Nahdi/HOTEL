package fr.hotel.dto;

import java.util.Date;

import fr.hotel.entities.Adresse;
import fr.hotel.entities.Resa;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ResaDTO {


	private Integer id;
	
	private Date dateDebut;

	
	private Date dateFin;

	
	private Integer numeroChambre;

	
	private HotelDTO hotel;


	private ClientDTO client;
	
	
	public static ResaDTO fromEntity(Resa resa) {
		if (resa == null) {
		      return null;
		    }
		return ResaDTO.builder()
				.id(resa.getResa_id())
				.dateDebut(resa.getDateDebut())
				.dateFin(resa.getDateFin())
				.numeroChambre(resa.getNumeroChambre())
				.hotel(HotelDTO.fromEntity(resa.getHotel()))
				.client(ClientDTO.fromEntity(resa.getClient()))
				.build();
	}
	
	public static Resa toEntity(ResaDTO resaDTO) {
	    if (resaDTO == null) {
	      return null;
	    }
	    Resa resa = new Resa();
	    resa.setResa_id(resaDTO.getId());
	    resa.setDateDebut(resaDTO.getDateDebut());
	    resa.setDateFin(resaDTO.getDateFin());
	    resa.setNumeroChambre(resaDTO.getNumeroChambre());
	    resa.setHotel(HotelDTO.toEntity(resaDTO.getHotel()));
	    resa.setClient(ClientDTO.toEntity(resaDTO.getClient()));
	    return resa;
	  }
}
