package jpa01.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="emprunt")
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_FIN")
	private Date dateFin;
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client idClient; 
	
	@ManyToMany
	@JoinTable(name="COMPO",
	           joinColumns=@JoinColumn(name="ID_EMP"),
	           inverseJoinColumns=@JoinColumn(name="ID_LIV"))
	private Set<Livre> livre ;
	
	public Emprunt() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	public Set<Livre> getLivre() {
		return livre;
	}

	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}

	
	@Override
	public String toString() {
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		return "Emprunt [id=" + id + ", datedebut=" + 
				formater.format(dateDebut) + 
				", datefin=" + formater.format(dateFin) + "]";
	}

	
	          
	
}
