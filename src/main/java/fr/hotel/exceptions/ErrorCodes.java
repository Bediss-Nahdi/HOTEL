package fr.hotel.exceptions;



// 1 // Contient les codes d'erreurs
public enum ErrorCodes {

  ADMIN_NOT_FOUND(1000),
  ADMIN_NOT_VALID(1001),
  ADMIN_ALREADY_IN_USE(1002),
  ADMIN_CHANGE_PASSWORD_OBJECT_NOT_VALID(1003),

  ADRESSE_NOT_FOUND(2000),
  ADRESSE_NOT_VALID(2001),
  ADRESSE_ALREADY_IN_USE(2002),

  CLIENT_NOT_FOUND(3000),
  CLIENT_NOT_VALID(3001),
  CLIENT_ALREADY_IN_USE(3002),

  RESERVATION_CLIENT_NOT_FOUND(4000),
  RESERVATION_CLIENT_NOT_VALID(4001),
  RESERVATION_CLIENT_NON_MODIFIABLE(4002),
  RESERVATIONE_CLIENT_ALREADY_IN_USE(4003),

  // Liste des exception techniques
  UPDATE_PHOTO_EXCEPTION(6000),
  UNKNOWN_CONTEXT(6001), 
  BAD_CREDENTIALS (6002)
  
  ;

	
	// Création des énumaration via l'attribut de class "code"
  private int code;

  ErrorCodes(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
