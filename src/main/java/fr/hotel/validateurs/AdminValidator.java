package fr.hotel.validateurs;

import java.util.ArrayList;
import java.util.List;


//import org.springframework.util.
import org.springframework.util.StringUtils;

import fr.hotel.dto.AdminDTO;



public class AdminValidator {

	
	
	public static List<String> validate(AdminDTO adminDto) {
	    List<String> errors = new ArrayList<>();
	    
	    
	    if (adminDto == null) {
		      errors.add("Veuillez renseigner votre nom d'utilisateur");
		      errors.add("Veuillez renseigner votre mot de passe");
		      
		      return errors;
		    }
	    
	    if (adminDto == null || !StringUtils.hasLength(adminDto.getUsername())) {
	        errors.add("Veuillez renseigner nom d'utilisateur");
	      }
	    if (adminDto == null || !StringUtils.hasLength(adminDto.getPassword())) {
	        errors.add("Veuillez renseigner  mot de passe");
	      }
	    
	    
	    
		return errors;
	    
	}
}
