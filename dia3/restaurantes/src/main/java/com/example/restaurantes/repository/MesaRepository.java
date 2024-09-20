package com.example.restaurantes.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MesaRepository {

    private EntityManager entityManager;

    public MesaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void addMesa(Mesa mesa) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(mesa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

