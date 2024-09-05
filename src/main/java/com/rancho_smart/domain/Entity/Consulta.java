package com.rancho_smart.domain.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false)
    private long Id_Historial;
    
    public long getId_Historial() {
        return Id_Historial;
    }

    public void setId_Historial(long id_Historial) {
        Id_Historial = id_Historial;
    }

    @Column(nullable = false)
    private String diagnostico;

    @Column(nullable = false)
    private LocalDate fechaConsulta;

    @Column
    private String comentarios;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    // Constructor por defecto
    public Consulta() {}

    // Constructor con parámetros
    public Consulta(String diagnostico, long Id_Historial,LocalDate fechaConsulta, String comentarios) {
        this.diagnostico = diagnostico;
        this.Id_Historial=Id_Historial;
        this.fechaConsulta = fechaConsulta;
        this.comentarios = comentarios;
    }
}
