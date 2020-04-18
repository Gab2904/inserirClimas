package br.usjt.usjt_clima_jpa_hibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.usjt_clima_jpa_hibernate.model.Clima;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Clima");
		List<Clima>climas = query.getResultList();
		for(Clima c : climas) {
			System.out.println(c);
		}
		manager.close();
		JPAUtil.close();
	}

}
