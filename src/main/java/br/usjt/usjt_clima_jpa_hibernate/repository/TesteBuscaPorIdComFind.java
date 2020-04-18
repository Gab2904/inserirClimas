package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.usjt.usjt_clima_jpa_hibernate.model.Clima;

public class TesteBuscaPorIdComFind {
	public static void main(String args[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		Clima c = manager.find(Clima.class, 1L);
		System.out.println(c);
		manager.close();
		JPAUtil.close();
	}
}
