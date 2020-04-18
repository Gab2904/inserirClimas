package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_clima_jpa_hibernate.model.Clima;

public class TesteAtualizaPrevisao {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Clima c = manager.find(Clima.class, 1L);
		c.setDescricao("Ensolarado");
		c.setTempMin("20°");
		c.setTempMax("38°");
		c.setUmidaRelativa("2%");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
