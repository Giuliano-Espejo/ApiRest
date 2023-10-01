package com.GiulianoEspejo.ApiRest.controllers;

import com.GiulianoEspejo.ApiRest.entities.Domicilio;
import com.GiulianoEspejo.ApiRest.services.DomicilioServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImp>{
}
