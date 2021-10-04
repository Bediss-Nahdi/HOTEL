package fr.hotel.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class AdminDTO {

	private long id;

	private String username;


	private String password;


	private List<RolesDTO> roles;
}
