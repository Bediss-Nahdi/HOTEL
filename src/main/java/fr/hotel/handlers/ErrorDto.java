package fr.hotel.handlers;

import java.util.ArrayList;
import java.util.List;

import fr.hotel.exceptions.ErrorCodes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 1 //

// objet que je capte une exception
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

	
	//
	private Integer httpCode;

	// Qui provient du package des exceptions
	private ErrorCodes code;

	private String message;

	private List<String> errors = new ArrayList<>();
}
