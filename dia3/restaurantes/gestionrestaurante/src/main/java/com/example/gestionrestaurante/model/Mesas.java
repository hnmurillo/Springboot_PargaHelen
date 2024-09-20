package com.example.gestionrestaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mesas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroMesa;
    private boolean ocupada;

    // Constructor vacío requerido por JPA
    public Mesas() {
        // Constructor vacío
    }

    // Constructor con parámetros
    public Mesas(int numeroMesa, boolean ocupada) {
        this.numeroMesa = numeroMesa;
        this.ocupada = ocupada;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    //Sobrescribimos el método toString//
    @Override
    public String toString() {
        return "Mesa [id=" + id + ", numeroMesa=" + numeroMesa + ", ocupada=" + ocupada + "]";
    }
}
