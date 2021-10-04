package fr.hotel.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ResaDTO {


	private long id;
	
	private Date dateDebut;

	
	private Date dateFin;

	
	private int numeroChambre;

	
	private HotelDTO hotel;


	private ClientDTO client;
}
