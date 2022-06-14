package com.springdata.primeiroprojetospring.controller;

import com.springdata.primeiroprojetospring.service.crudCargoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargosController {
        final crudCargoService service;
        public CargosController(crudCargoService service) {
            this.service = service;
        }
}
