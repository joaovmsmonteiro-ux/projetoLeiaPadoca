package com.example.cardapio_leia_padoca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio_leia_padoca.backery.Backery;

@RestController 
/* Defini o endpoint para o controlador de padaria */
@RequestMapping ("/bakery")
public class BakeryController {
    /* Esse metodo é chamado quando o endpoint /bakery é acessado */
    @GetMapping 
    public String getAll() {

        /*Backery bakery = new Backery();*/







        
    }
}
