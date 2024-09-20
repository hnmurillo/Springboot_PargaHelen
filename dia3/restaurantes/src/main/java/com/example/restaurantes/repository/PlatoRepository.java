package com.example.restaurantes.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PlatoRepository {

    private EntityManager entityManager;

    public PlatoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void addPlato(Plato plato) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(plato);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
