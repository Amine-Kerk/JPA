package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import jpa01.model.Client;
import jpa01.model.Emprunt;
import jpa01.model.Livre;


public class TestBibliotheque {
	private EntityManagerFactory factory = null;
	
	@Before
	public void init() {
		factory = Persistence.createEntityManagerFactory("pu_essai");
	}
	
	@Test
	public void testExtractLivre() {	
		EntityManager em = factory.createEntityManager();

		//Réalisez une requête qui permet d’extraire un emprunt et tous ses livres associés
		TypedQuery<Emprunt> query = em.createQuery("SELECT e FROM Emprunt e WHERE id=1", Emprunt.class);
		Emprunt listEmprunt = query.getResultList().get(0);

			System.out.println(listEmprunt.getLivre());


		//close connection
		em.close();
		factory.close();
	}
	
	@Test
	public void testExtractClient() {	
		EntityManager em = factory.createEntityManager();

		//Réalisez une requête qui permet d’extraire tous les emprunts d’un client donné
		TypedQuery<Client> query = em.createQuery("SELECT c FROM Client c WHERE id=1", Client.class);
		Client listClient = query.getResultList().get(0);

		System.out.println("Les emprunts du client 1 sont: ");
			System.out.println(listClient.getListEmprunt());

		//close connection
		em.close();
		factory.close();
	}

}
