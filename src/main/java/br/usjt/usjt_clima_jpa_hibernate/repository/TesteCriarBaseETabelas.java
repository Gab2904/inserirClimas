package br.usjt.usjt_clima_jpa_hibernate.repository;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}

}
