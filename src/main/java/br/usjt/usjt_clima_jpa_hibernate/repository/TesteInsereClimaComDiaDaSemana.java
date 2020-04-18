package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_clima_jpa_hibernate.model.Clima;
import br.usjt.usjt_clima_jpa_hibernate.model.Semana;

public class TesteInsereClimaComDiaDaSemana {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana d = new Semana();
		d.setDia("Segunda");
		manager.persist(d);
		Clima c = new Clima();
		c.setTempMin("18°");
		c.setTempMax("26°");
		c.setUmidaRelativa("29%");
		c.setDescricao("Dia inteiro ensolarado, sem nuves.");
		c.setDataHora("23-03-2020 15:30");
		c.setDiaDaSemana(d);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
