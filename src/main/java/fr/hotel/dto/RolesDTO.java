package fr.hotel.dto;

import fr.hotel.entities.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDTO {

	private Integer id;

	
	private String role;
	
	
	public static RolesDTO fromEntity(Roles roles) {
	    if (roles == null) {
	      return null;
	    }
	    return RolesDTO.builder()
	        .id(roles.getRole_id())
	        .role(roles.getRole())
	        .build();
	  }

	  public static Roles toEntity(RolesDTO roleDTO) {
	    if (roleDTO == null) {
	      return null;
	    }
	    Roles roles = new Roles();
	    roles.setRole_id(roleDTO.getId());
	    roles.setRole(roleDTO.getRole());
	    return roles;
	  }
}
