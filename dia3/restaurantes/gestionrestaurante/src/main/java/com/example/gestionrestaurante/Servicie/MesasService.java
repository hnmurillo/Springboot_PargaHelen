package com.example.gestionrestaurante.Servicie;

import com.example.gestionrestaurante.model.Mesas;
import com.example.gestionrestaurante.repository.MesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesasService {

    @Autowired
    private MesasRepository mesasRepository;


// obtener todas las mesas
        public List<Mesas> getAllMesas(){
        return MesasRepository.findAll();
    }

 // obtener mesa por id

    public Optional<Mesas> getMesasById(long id){
        return mesasRepository.findById(id);
    }
    // guardar mesa

    public Mesas saveMesas (Mesas mesas){
        return mesasRepository.save(mesas);
    }

    
}

