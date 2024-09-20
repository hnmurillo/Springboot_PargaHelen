package com.example.gestionrestaurante.Servicie;

import com.example.gestionrestaurante.model.Mesas;
import com.example.gestionrestaurante.model.Plato;
import com.example.gestionrestaurante.repository.MesasRepository;
import com.example.gestionrestaurante.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantManager {

    @Autowired
    private MesasRepository mesasRepository;


// obtener todas las mesas
        public List<Mesas> getAllMesas(){
            return mesasRepository.findAll();
    }

 // obtener mesa por id

        public Optional<Mesas> getMesasById(long id){
            return mesasRepository.findById(id);
    }
    // guardar mesa

    public Mesas saveMesas (Mesas mesas){
            return mesasRepository.save(mesas);
    }

    public Mesas actualizarMesa(Long id, Mesas mesaDetalles) {
        Mesas mesas = mesasRepository.findById(id).orElseThrow(); // Opción sin excepción personalizada
        mesas.setNumeroMesa(mesaDetalles.getNumeroMesa()); // Uso de la instancia 'mesas'
        mesas.setOcupada(mesaDetalles.isOcupada()); // Uso de la instancia 'mesas'
        return mesasRepository.save(mesas); // 'mesasRepository' en lugar de 'mesaRepository'
    }
    public void eliminarMesa(Long id){
        mesasRepository.deleteById(id);
    }


    @Autowired
    private PlatoRepository platoRepository;

    public List<Plato> getAllPlato(){
        return platoRepository.findAll();
    }

    public Plato savePlato (Plato plato){
        return platoRepository.save(plato);
    }

    public Optional<Plato> getPlatoById(long id){
        return platoRepository.findById(id);
    }

    public Plato actualizarPlato(Long id, Plato platoDetalles) {

        // Buscar el plato por ID
        Optional<Plato> platoOptional = platoRepository.findById(id);


        // Si el plato existe, actualizar sus detalles

        Plato plato = platoOptional.get();
        plato.setNombre(platoDetalles.getNombre());
        plato.setPrecio(platoDetalles.getPrecio());
        plato.setDisponibilidad(platoDetalles.isDisponibilidad());

        // Guardar el plato actualizado
        return platoRepository.save(plato);
    }
    public void eliminarPlato(Long id){
        platoRepository.deleteById(id);
    }



}

