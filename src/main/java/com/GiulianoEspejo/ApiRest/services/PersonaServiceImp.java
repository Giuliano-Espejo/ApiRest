package com.GiulianoEspejo.ApiRest.services;

import com.GiulianoEspejo.ApiRest.entities.Persona;
import com.GiulianoEspejo.ApiRest.repositories.BaseRepository;
import com.GiulianoEspejo.ApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImp extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImp(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
