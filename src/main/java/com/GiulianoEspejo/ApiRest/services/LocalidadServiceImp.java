package com.GiulianoEspejo.ApiRest.services;

import com.GiulianoEspejo.ApiRest.entities.Localidad;
import com.GiulianoEspejo.ApiRest.repositories.BaseRepository;
import com.GiulianoEspejo.ApiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImp extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImp(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
