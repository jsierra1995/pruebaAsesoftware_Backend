/**
 * 
 */
package com.apirest.prueba.tecnica.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.prueba.tecnica.Service.TurnosService;
import com.apirest.prueba.tecnica.model.Turno;

/**
 * @author juans
 *
 */
@RestController
@RequestMapping("/api/turnos")
public class TurnosController {

    @Autowired
    private TurnosService turnosService; // Crea este servicio

    @PostMapping("/generar")
    public List<Turno> generarTurnos(
            @RequestParam("fechaInicio") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaInicio,
            @RequestParam("fechaFin") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaFin,
            @RequestParam("idServicio") Long idServicio
    ) {
        return turnosService.generarTurnos(fechaInicio, fechaFin, idServicio);
    }
}

