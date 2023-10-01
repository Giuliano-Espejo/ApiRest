package com.GiulianoEspejo.ApiRest.repositories;

import com.GiulianoEspejo.ApiRest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
