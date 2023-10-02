package com.GiulianoEspejo.ApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private List<Autor> autores;
}
