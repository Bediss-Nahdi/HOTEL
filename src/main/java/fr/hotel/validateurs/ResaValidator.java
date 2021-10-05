package fr.hotel.validateurs;

import java.util.ArrayList;
import java.util.List;

import fr.hotel.dto.ResaDTO;

public class ResaValidator {

	
	public static List<String> validate(ResaDTO resaDto) {
	    List<String> errors = new ArrayList<>();
	
	if (resaDto == null) {
	      errors.add("Veuillez renseigner la date d'arrivée");
	      errors.add("Veuillez renseigner la date de départ");
	      errors.add("Veuillez renseigner le numéro de chambre");
	      
	     
	      
	      return errors;
	    }
  
  if (resaDto == null || resaDto.getDateDebut()==null) {
	  errors.add("Veuillez renseigner votre nom ");
    }
  if (resaDto == null || resaDto.getDateFin() == null) {
	  errors.add("Veuillez renseigner votre prenom ");
    }
  
  if (resaDto == null || resaDto.getNumeroChambre() == null) {
	  errors.add("Veuillez renseigner votre prenom ");
    }
  return errors;
}
}
