package fr.hotel.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "admin_id", nullable = false)
	private Integer admin_id;

	
	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password")
	private String password;

	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "admin_role", joinColumns = @JoinColumn(name = "admin_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Roles> roles;
}
