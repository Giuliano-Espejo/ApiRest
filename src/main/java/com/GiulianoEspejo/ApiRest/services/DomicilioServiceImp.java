package com.GiulianoEspejo.ApiRest.services;

import com.GiulianoEspejo.ApiRest.entities.Domicilio;
import com.GiulianoEspejo.ApiRest.repositories.BaseRepository;
import com.GiulianoEspejo.ApiRest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImp extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImp(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
