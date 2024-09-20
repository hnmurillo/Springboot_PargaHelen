package com.example.restaurantes.model;

import javax.persistence.*;

@Entity
@Table(name = "mesa")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "numero_mesa", unique = true, nullable = false)
    private int numeroMesa;

    @Column(name = "ocupada", nullable = false)
    private boolean ocupada;

    // Constructor vacío requerido por JPA
    public Mesa() {}

    public Mesa(int numeroMesa, boolean ocupada) {
        this.numeroMesa = numeroMesa;
        this.ocupada = ocupada;
    }

    // Getters y Setters
    // ...

    @Override
    public String toString() {
        return "Mesa [id=" + id + ", numeroMesa=" + numeroMesa + ", ocupada=" + ocupada + "]";
    }
}

