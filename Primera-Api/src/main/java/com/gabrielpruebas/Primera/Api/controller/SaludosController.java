package com.gabrielpruebas.Primera.Api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apisaludos")
public class SaludosController {

    @GetMapping("/hola")
    public String holaMundo () {
        return "Hola mundo!";
    }

    @GetMapping("holadatos/{nombre}/{edad}")
    public String holaMundoDatos (@PathVariable String nombre,@PathVariable int edad) {
        return "Hola mundo! " + nombre + " tu edad es: " + edad + " años.";
    }
}
