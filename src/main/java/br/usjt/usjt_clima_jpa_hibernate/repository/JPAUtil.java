package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	
	static {
		factory=Persistence.createEntityManagerFactory("usjtPU");
	}
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	public static void close() {
		factory.close();
	}
}
