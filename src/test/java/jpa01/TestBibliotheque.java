package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import jpa01.model.Emprunt;
import jpa01.model.Livre;


public class TestBibliotheque {
	private EntityManagerFactory factory = null;
	
	@Before
	public void init() {
		factory = Persistence.createEntityManagerFactory("pu_essai");
	}
	
	@Test
	public void findEmprunt() {
		EntityManager em = factory.createEntityManager();
		
		if(em != null ) {
			Livre l = em.find(Livre.class,1);
			if(l != null) System.out.println(l.getTitre());
		}
		em.close();
		factory.close();
	}
	
}
	
