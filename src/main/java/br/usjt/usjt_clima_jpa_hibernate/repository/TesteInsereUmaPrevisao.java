package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_clima_jpa_hibernate.model.Clima;

public class TesteInsereUmaPrevisao {
	public static void main(String args[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Clima c = new Clima();
		c.setTempMin("15°");
		c.setTempMax("23°");
		c.setUmidaRelativa("80%");
		c.setDescricao("céu claro");
		c.setDataHora("23/03/2020");
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
