package fr.hotel.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client implements Serializable {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "client_id", nullable = false)
	private long client_id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

//	@Column(name = "mot_de_passe")
//	private String moteDePasse;

	@Embedded
	private Adresse adresse;

	@Column(name = "photo")
	private String photo;

	@Column(name = "mail")
	private String email;

	@Column(name = "numero_telephone")
	private String telephone;

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
//	private List<Resa> resa;


}
