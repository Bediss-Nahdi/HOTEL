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
@NoArgsConstructor
@Data
@Getter @Setter
@AllArgsConstructor 
@ToString
public class Hotel implements Serializable{
	
	@Id
    @Column(name = "id", nullable = false)
	private long id;
	
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "nombre_etoiles")
	private int etoiles;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;
	
	//Ce qui a été modifié % à l'exo
	// private String adresse;
	// private Ville ville;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "hotel")
	private List<Resa> resa;
	
	

}
