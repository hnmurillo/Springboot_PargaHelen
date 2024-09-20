


package com.example.restaurantes.model;

import javax.persistence.*;

@Entity
public class Plato {
    @Table(name = "plato")
    public class Plato {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "precio", nullable = false)
        private double precio;

        @Column(name = "disponibilidad", nullable = false)
        private boolean disponibilidad;



        // Constructor vacío requerido por JPA
        public Plato() {}

        public Plato(String nombre, double precio, boolean disponibilidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.disponibilidad = disponibilidad;
        }

        // Getters y Setters
        // ...

        @Override
        public String toString() {
            return "Plato [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", disponibilidad=" + disponibilidad + "]";
        }
    }

}
