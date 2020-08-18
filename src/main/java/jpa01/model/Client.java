package jpa01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	@Id
	private int id ;
	
	@Column(name = "NOM",length = 255 , nullable = false )
	private String Nom ;
	
	@Column(name = "PRENOM",length = 255 , nullable = false )
	private String Prenom ;

	public Client() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Client [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	

	
	
	
}
