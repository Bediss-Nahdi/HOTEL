package fr.hotel.validateurs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import fr.hotel.dto.AdminDTO;
import fr.hotel.dto.ClientDTO;

public class ClientValidator {
	
	

	public static List<String> validate(ClientDTO clientDto) {
	    List<String> errors = new ArrayList<>();
	
	if (clientDto == null) {
	      errors.add("Veuillez renseigner votre nom ");
	      errors.add("Veuillez renseigner votre prenom");
	      errors.add("Veuillez renseigner votre adresse");
	      errors.addAll(AdresseValidator.validate(null));
	      errors.add("Veuillez renseigner votre email");
	      errors.add("Veuillez renseigner votre téléphone");
	      
	      return errors;
	    }
  
  if (clientDto == null || !StringUtils.hasLength(clientDto.getNom())) {
	  errors.add("Veuillez renseigner votre nom ");
    }
  if (clientDto == null || !StringUtils.hasLength(clientDto.getPrenom())) {
	  errors.add("Veuillez renseigner votre prenom ");
    }
  
  errors.addAll(AdresseValidator.validate(clientDto.getAdresse()));
  
  if (clientDto == null || !StringUtils.hasLength(clientDto.getEmail())) {
	  errors.add("Veuillez renseigner votre email");
    }
  if (clientDto == null || !StringUtils.hasLength(clientDto.getTelephone())) {
	  errors.add("Veuillez renseigner votre téléphone");
    }
  return errors;
}
	
}
