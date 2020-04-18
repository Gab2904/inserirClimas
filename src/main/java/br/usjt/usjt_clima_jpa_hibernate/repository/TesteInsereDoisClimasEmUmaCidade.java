package br.usjt.usjt_clima_jpa_hibernate.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_clima_jpa_hibernate.model.Cidade;
import br.usjt.usjt_clima_jpa_hibernate.model.Clima;
import br.usjt.usjt_clima_jpa_hibernate.model.Semana;

public class TesteInsereDoisClimasEmUmaCidade {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade c= new Cidade();
		c.setNome("São Paulo");
		c.setLatitude(29.63);
		c.setLongitude(-68.90);
		Semana d1 = new Semana();
		Semana d2 = new Semana();
		d1.setDia("Segunda");
		d2.setDia("Terça");
		manager.persist(d1);
		manager.persist(d2);
		List<Clima>climas = new ArrayList<>();
		Clima c1 = new Clima();
		c1.setTempMin("18°");
		c1.setTempMax("29°");
		c1.setUmidaRelativa("20%");
		c1.setDescricao("O dia inteiro ensolarado.");
		c1.setDataHora("30-04-2020, 15:46");
		c1.setDiaDaSemana(d1);
		c1.setCidade(c);
		Clima c2 = new Clima();
		c2.setTempMin("15°");
		c2.setTempMax("35°");
		c2.setUmidaRelativa("8%");
		c2.setDescricao("Dia ensolarado");
		c2.setDataHora("01-05-2020, 17:25");
		c2.setDiaDaSemana(d2);
		c2.setCidade(c);
		climas.add(c1);
		climas.add(c2);
		c.setClimas(climas);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
