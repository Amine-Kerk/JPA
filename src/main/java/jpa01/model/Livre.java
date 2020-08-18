package jpa01.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="LIVRE")
public class Livre {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name = "TITRE",length = 255 , nullable = false )
	private String titre ;
	
	@Column(name = "AUTEUR",length = 50 , nullable = false )
	private String auteur ;
	
	@ManyToMany (mappedBy="livre")
	private Set<Emprunt> emprunts;
	
	public Livre () {
       
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", emprunts=" + emprunts + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

	
	
	



	
	
	 

}
