package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_clima_jpa_hibernate.model.Semana;

public class TesteRemovePrevisaoComDia {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana d = manager.find(Semana.class, 1L);
		manager.remove(d);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
