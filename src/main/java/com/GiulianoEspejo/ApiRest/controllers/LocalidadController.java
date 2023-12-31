package com.GiulianoEspejo.ApiRest.controllers;

import com.GiulianoEspejo.ApiRest.entities.Localidad;
import com.GiulianoEspejo.ApiRest.services.LocalidadServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImp> {
}
