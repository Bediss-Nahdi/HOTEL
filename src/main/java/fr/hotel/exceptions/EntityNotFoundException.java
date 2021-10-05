package fr.hotel.exceptions;

import lombok.Getter;


// 2 // Exception générique : si on fait une recherche dans la BDD mais que l'on retrouve pas
public class EntityNotFoundException extends RuntimeException {

  @Getter
  private ErrorCodes errorCode;

  public EntityNotFoundException(String message) {
    super(message);
  }

  public EntityNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public EntityNotFoundException(String message, ErrorCodes errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

}
