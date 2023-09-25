package com.apirest.prueba.tecnica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.prueba.tecnica.model.Comercio;
import com.apirest.prueba.tecnica.model.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

	Comercio createServicio(Comercio idComercio);

	Comercio updateServicio(Long idTurno, Comercio updatedServicio);

	Comercio deleteServicio(Long idTurno, Comercio deleteServicio);

    
}


