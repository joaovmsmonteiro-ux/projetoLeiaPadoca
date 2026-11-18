package com.example.cardapio_leia_padoca.backery;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Backery
 * 
 * Entidade que representa a padaria, com seus atributos e métodos.
 * 
 * Entity que será mapeada para a tabela "backery" no banco de dados.
 * 
 * O Entity é uma classe que representa uma tabela no banco de dados, 
 * e cada instância da classe representa uma linha na tabela.
 * 
 */

@Table(name = "backerys")
@Entity(name = "backerys")
public class Backery {
    /* colunas */

    @Id /* Primary Key */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Geração automática do ID */
    private Long id; /* ID da padaria */

    private String title; /* Nome da padaria */

    private String image; /* Imagens da padaria */

    private String price; /* Preço da padaria */


}
