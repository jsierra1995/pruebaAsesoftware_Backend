package com.apirest.prueba.tecnica.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apirest.prueba.tecnica.model.Turno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class TurnosService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Turno> generarTurnos(LocalDate fechaInicio, LocalDate fechaFin, Long idServicio) {
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("generar_turnos");

        storedProcedure.registerStoredProcedureParameter("fecha_inicio", LocalDate.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("fecha_fin", LocalDate.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("id_servicio", Long.class, ParameterMode.IN);

        storedProcedure.setParameter("fecha_inicio", fechaInicio);
        storedProcedure.setParameter("fecha_fin", fechaFin);
        storedProcedure.setParameter("id_servicio", idServicio);

        return storedProcedure.getResultList();
    }
}
