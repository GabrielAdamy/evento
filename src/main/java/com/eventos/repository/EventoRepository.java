package com.eventos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventos.models.Evento;
@Repository 

public interface EventoRepository extends JpaRepository<Evento, String> {

}
