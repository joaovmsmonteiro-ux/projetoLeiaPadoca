package com.example.cardapio_leia_padoca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
/* Defini o endpoint para o controlador de padaria */
@RequestMapping ("/bakery")
public class BakeryController {
    /* Esse metodo é chamado quando o endpoint /bakery é acessado */
    @GetMapping 
    public String getAllInfo() {
        return 
        "Informações da padaria";
    }
}
