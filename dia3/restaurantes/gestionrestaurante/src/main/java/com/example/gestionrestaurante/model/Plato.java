package com.example.gestionrestaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "plato")
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "disponibilidad", nullable = false)
    private boolean disponibilidad;

    // Constructor vacío requerido por JPA
    public Plato() {}

    // Constructor con parámetros
    public Plato(String nombre, double precio, boolean disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método toString para representar el objeto como cadena de texto
    @Override
    public String toString() {
        return "Plato [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", disponibilidad=" + disponibilidad + "]";
    }
}
