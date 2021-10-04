package fr.hotel.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
public class User  implements Serializable{
	
	@Id
    @Column(name = "id", nullable = false)
	private long id;
	
	  @Column(name = "nom")
	  private String nom;

	  @Column(name = "prenom")
	  private String prenom;

	  @Column(name = "mot_de_passe")
	  private String moteDePasse;
	  
	  @Column(name = "roles")
	  private String roles;
	  
	  @Embedded
	  private Adresse adresse;

	  @Column(name = "photo")
	  private String photo;

	  @Column(name = "mail")
	  private String email;

	  @Column(name = "numTel")
	  private String telephone;
	  
	  @OneToMany (fetch = FetchType.EAGER, mappedBy = "user")
	  private List<Resa> reservation;


}
