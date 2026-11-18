package com.example.cardapio_leia_padoca.controller;

import com.example.cardapio_leia_padoca.backery.Backery;
import com.example.cardapio_leia_padoca.backery.BackeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
/* Defini o endpoint para o controlador de padaria */
@RequestMapping ("/backery")
public class BackeryController {
    
/* 
 * BakeryController
 * 
 * Controlador que gerencia as requisições relacionadas à padaria.
 * 
 * O controlador é responsável por receber as requisições HTTP, processá-las e retornar uma resposta.
 * 
 * Ele atua como uma ponte entre o cliente (frontend) e o serviço (backend).
 *
 * 
// * Autowired
 * 
 * Injeta a dependência do repositório. 
 * 
 * Qualquer dependência que seja necessária em uma classe. 
 * 
 * Onde o Spring que irá gerenciar a criação e a injeção da dependência.
 * 
 * É utilizado o @Autowired para injetar a dependência do repositório na classe BakeryController.
 * 
 **/ 
 
    @Autowired  
    private BackeryRepository repository;     
    
    
    /* Esse metodo é chamado quando o endpoint /backery é acessado */
    @GetMapping 
    public List<Backery> getAll() {

        /* Lista da padaria */
        List<Backery> backeriesList = repository.findAll(); /* Busca todas os itens no banco de dados */
        return backeriesList;
    }
}
