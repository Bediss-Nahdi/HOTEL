package fr.hotel.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter @Setter
@Embeddable
@Entity
public class Adresse implements Serializable {

	@Id
    @Column(name = "id", nullable = false)
	private long id;
	
  @Column(name = "adresse1")
  private String adresse1;

  @Column(name = "adresse2")
  private String adresse2;

  @Column(name = "ville")
  private String ville;

  @Column(name = "code_postale")
  private String codePostale;

  @Column(name = "pays")
  private String pays;

}