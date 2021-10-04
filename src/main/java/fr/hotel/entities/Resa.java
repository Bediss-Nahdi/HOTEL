package fr.hotel.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Resa implements Serializable {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "resa_id", nullable = false)
	private long resa_id;

	@Column(name = "date_de_debut")
	private Date dateDebut;

	@Column(name = "date_de_fin")
	private Date dateFin;

	@Column(name = "numero_Chambre")
	private int numeroChambre;

	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

}
