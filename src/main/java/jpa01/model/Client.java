package jpa01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	
	@Id
	private int id;
	
	@Column(name="NOM", length=50, nullable=false)
	private String nom;

	@Column(name="PRENOM", length=50, nullable=false)
	private String prenom;

	@OneToMany(mappedBy="idClient")
	private List<Emprunt> listEmprunt;

	@OneToMany
	@JoinColumn(name="EMP_ID")
	private int empId;
	
	public Client() {
		super();
	}



	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
		
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getEmpId() {
		return empId;
	}
	public List<Emprunt> getListEmprunt() {
		return listEmprunt;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
		
	}
	public void setListEmprunt(List<Emprunt> listEmprunt) {
		this.listEmprunt = listEmprunt;
	}


}
