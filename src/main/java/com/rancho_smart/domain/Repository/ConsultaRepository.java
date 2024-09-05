package com.rancho_smart.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.domain.Entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}