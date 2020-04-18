package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.usjt.usjt_clima_jpa_hibernate.model.Cidade;

public class TesteBuscaOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidade c = manager.find(Cidade.class, 1L);
		System.out.println(c.getClimas());
		manager.close();
		JPAUtil.close();
	}

}
