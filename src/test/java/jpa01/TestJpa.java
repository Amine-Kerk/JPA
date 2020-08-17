package jpa01;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestJpa {
	
	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
	}

}
