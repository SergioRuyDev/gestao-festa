package com.sergioruy.festa.repository;

import com.sergioruy.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {
}
