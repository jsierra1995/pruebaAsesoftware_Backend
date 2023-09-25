package com.apirest.prueba.tecnica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.prueba.tecnica.model.Comercio;

public interface ComercioRepository extends JpaRepository<Comercio, Long> {

	Comercio createComercio(Comercio idComercio);

	Comercio updateComercio(Long idComercio, Comercio updatedPerson);

	Comercio deleteComercio(Long idComercio, Comercio deletePerson);

    
}
