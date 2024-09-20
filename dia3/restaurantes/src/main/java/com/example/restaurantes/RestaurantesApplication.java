package com.example.restaurantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@SpringBootApplication

public class RestaurantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantesApplication.class, args);

		// Crear el EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("restaurant_management");
		EntityManager em = emf.createEntityManager();

		// Crear repositorios
		PlatoRepository platoRepo = new PlatoRepository(em);
		MesaRepository mesaRepo = new MesaRepository(em);

		// Añadir un plato
		Plato plato = new Plato("Pizza Margherita", 8.50, true);
		platoRepo.addPlato(plato);

		// Registrar una mesa
		Mesa mesa = new Mesa(5, false);
		mesaRepo.addMesa(mesa);

		// Cerrar el EntityManager
		em.close();
		emf.close();
	}

	}


