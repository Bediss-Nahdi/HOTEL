package fr.hotel.validateurs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import fr.hotel.dto.ClientDTO;
import fr.hotel.dto.HotelDTO;

public class HotelValidator {

	public static List<String> validate(HotelDTO hotelDto) {
	    List<String> errors = new ArrayList<>();
	
	if (hotelDto == null) {
	      errors.add("Veuillez renseigner votre nom de l'hôtel");
	      errors.add("Veuillez renseigner le nombre d'étoile prenom");
	      errors.add("Veuillez renseigner votre téléphone");
	      errors.add("Veuillez renseigner votre adresse");
	      errors.addAll(AdresseValidator.validate(null));
	      errors.add("Veuillez renseigner votre email");
	     
	      
	      return errors;
	    }
  
  if (hotelDto == null || !StringUtils.hasLength(hotelDto.getNom())) {
	  errors.add("Veuillez renseigner votre nom ");
    }
  if (hotelDto == null || hotelDto.getEtoiles() == null) {
	  errors.add("Veuillez renseigner votre prenom ");
    }
  
  errors.addAll(AdresseValidator.validate(hotelDto.getAdresse()));
  
  if (hotelDto == null || !StringUtils.hasLength(hotelDto.getEmail())) {
	  errors.add("Veuillez renseigner votre email");
    }
  if (hotelDto == null || !StringUtils.hasLength(hotelDto.getTelephone())) {
	  errors.add("Veuillez renseigner votre téléphone");
    }
  return errors;
}
}
