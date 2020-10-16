package com.me.angelorum.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RestDemo {

    @Value("${bar:default_value}")
    private String myVariable;

    @GetMapping("/saludo")
    String saludo() {
        return "Cargando valor desde Variable de entorno: "+ myVariable;
    }

    //Implementar una demo invocando a un servicio externo
    @GetMapping("/proxy")
    String callService() {
        return "Invocacion de servicio externo "+ myVariable;
    }

    private 
}
