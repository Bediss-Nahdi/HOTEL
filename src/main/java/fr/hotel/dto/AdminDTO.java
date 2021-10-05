package fr.hotel.dto;

import java.util.List;
import java.util.stream.Collectors;

import fr.hotel.entities.Admin;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class AdminDTO {

	private long id;

	private String username;


	private String password;


	private List<RolesDTO> roles;
	
	
	public static AdminDTO fromEntity(Admin admin) {
	    if (admin == null) {
	      return null;
	    }

	    return AdminDTO.builder()
	        .id(admin.getAdmin_id())
	        .username(admin.getUsername())
	        .password(admin.getPassword())
	        .roles(
	        		admin.getRoles() != null ?
	        				admin.getRoles().stream()
	                    .map(RolesDTO::fromEntity)
	                    .collect(Collectors.toList()) : null
	        )
	        .build();
	  }

	  public static Admin toEntity(AdminDTO adminDto) {
	    if (adminDto == null) {
	      return null;
	    }

	    Admin admin = new Admin();
	    admin.setAdmin_id(adminDto.getId());
	    admin.setUsername(adminDto.getUsername());
	    admin.setPassword(adminDto.getPassword());
	   
	    return admin;
	  }
}
