package fr.hotel.exceptions;

import lombok.Getter;


// 4 // Gestionnaire d'exception globale : il va écouter toute l'application : dès qu'il y a une exception il la capte et on peut ajouter le traitement qu'on souhaite faire

		// ==> besoin d'un PACKAGE 		:	handlers

public class InvalidOperationException extends RuntimeException {

  @Getter
  private ErrorCodes errorCode;

  public InvalidOperationException(String message) {
    super(message);
  }

  public InvalidOperationException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidOperationException(String message, Throwable cause, ErrorCodes errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public InvalidOperationException(String message, ErrorCodes errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
}
