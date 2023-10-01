package com.GiulianoEspejo.ApiRest.controllers;


import com.GiulianoEspejo.ApiRest.entities.Persona;
import com.GiulianoEspejo.ApiRest.services.PersonaServiceImp;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImp>{

}
