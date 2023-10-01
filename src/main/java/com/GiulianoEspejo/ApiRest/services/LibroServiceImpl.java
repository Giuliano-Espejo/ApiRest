package com.GiulianoEspejo.ApiRest.services;

import com.GiulianoEspejo.ApiRest.entities.Libro;
import com.GiulianoEspejo.ApiRest.repositories.BaseRepository;
import com.GiulianoEspejo.ApiRest.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
