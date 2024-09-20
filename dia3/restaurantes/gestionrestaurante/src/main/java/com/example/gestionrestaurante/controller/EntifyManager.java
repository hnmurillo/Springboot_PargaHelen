package com.example.gestionrestaurante.controller;

import com.example.gestionrestaurante.model.Mesas;
import com.example.gestionrestaurante.model.Plato;
import com.example.gestionrestaurante.Servicie.RestaurantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class EntifyManager {

    @Autowired
    private RestaurantManager restaurantManager;

    //Obtener todo los platos
    //localhost:8080/api/Plato verbo GET

    @GetMapping("/Plato")
    public List<Plato> getAllPlato(){
        return restaurantManager.getAllPlato();
    }

    //Plato
    //Guardar un Plato
    //localhost:8080/api/plato con verbo POST
    @PostMapping("/Plato")
    public Plato savePlato ( @RequestBody Plato plato){
        return restaurantManager.savePlato(plato);
    }

    //Obtener un plato por ID
    //localhost:8080/api/plato/id con verbo GET
    @GetMapping("/Plato/{id}")
    public Optional<Plato> getPlatoById(@PathVariable Long id){
        return restaurantManager.getPlatoById(id);
    }

    //Actualizar un plato por ID
    //localhost:8080/api/plato/id con verbo PUT
    @PutMapping("/Plato/{id}")
    public Plato actualizarPlato(@PathVariable long id,@RequestBody Plato plato) {
        return restaurantManager.actualizarPlato(id, plato);
    }

    //Eliminar un plato por ID
    //localhost:8080/api/plato/id con verbo DELETE

    @DeleteMapping("/Plato/{id}")
    public void eliminarPlato(@PathVariable long id){
        restaurantManager.eliminarPlato(id);
    }

    //Obtener todo los mesa
    //localhost:8080/api/Plato verbo GET

    @GetMapping("/Mesa")
    public List<Mesas> getAllMesas(){
        return restaurantManager.getAllMesas();
    }

    //Mesas
    //Guardar un Mesas
    //localhost:8080/api/mesas con verbo POST
    @PostMapping("/Mesa")
    public Mesas saveMesas ( @RequestBody Mesas mesas){
        return restaurantManager.saveMesas(mesas);
    }

    //Obtener un mesas por ID
    //localhost:8080/api/plato/id con verbo GET
    @GetMapping("/Mesas/{id}")
    public Optional<Mesas> getMesasById(@PathVariable Long id){
        return restaurantManager.getMesasById(id);
    }

    //Actualizar un Mesas por ID
    //localhost:8080/api/plato/id con verbo PUT
    @PutMapping("/Mesas/{id}")
    public Mesas actualizarMesas(@PathVariable long id,@RequestBody Mesas mesas) {
        return restaurantManager.actualizarMesa(id, mesas);
    }

    //Eliminar un mesaspor ID
    //localhost:8080/api/plato/id con verbo DELETE

    @DeleteMapping("/Mesa/{id}")
    public void eliminarMesa(@PathVariable long id){
        restaurantManager.eliminarMesa(id);
    }
}
