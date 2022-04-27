package com.xworkz.restruntdao;

import com.xworkz.hibernatedemoapp.entity.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurentJPADao {
	private static void insertEntity() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistance");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		RestaurantEntity rest = new RestaurantEntity();
		entityManager.persist(rest);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
