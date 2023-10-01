package com.GiulianoEspejo.ApiRest.repositories;

import com.GiulianoEspejo.ApiRest.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
