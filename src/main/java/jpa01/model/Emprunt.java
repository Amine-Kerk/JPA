package jpa01.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Emprunt")
public class Emprunt {

	@Id
	@Column (name ="ID")
	private int id ;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEBUT",nullable =false)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN",nullable = true)
	private Date dateFin;
	
	@Column(name="DELAI")
	private int delai;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private int idClient; 
	
	@ManyToMany
	@JoinTable(name="COMPO",
	           joinColumns=@JoinColumn(name="ID_EMP"),
	           inverseJoinColumns=@JoinColumn(name="ID_LIV"))
	private Set<Livre> livre ;
	
	public Emprunt() {
		
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", idClient=" + idClient + ", livre=" + livre + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Set<Livre> getLivre() {
		return livre;
	}

	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}
	
	

	
	          
	
}
