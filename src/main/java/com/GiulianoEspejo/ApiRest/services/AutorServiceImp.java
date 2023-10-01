package com.GiulianoEspejo.ApiRest.services;


import com.GiulianoEspejo.ApiRest.entities.Autor;
import com.GiulianoEspejo.ApiRest.repositories.AutorRepository;
import com.GiulianoEspejo.ApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImp extends  BaseServiceImpl<Autor,Long> implements  AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImp(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}
