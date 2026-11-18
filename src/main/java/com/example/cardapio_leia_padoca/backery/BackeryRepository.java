package com.example.cardapio_leia_padoca.backery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BackeryRepository extends JpaRepository<Backery/* Entidade / Tabela */, Long/* Tipo do ID*/> {
}

