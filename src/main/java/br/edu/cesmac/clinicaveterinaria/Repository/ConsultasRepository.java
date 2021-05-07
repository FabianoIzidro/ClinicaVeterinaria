package br.edu.cesmac.clinicaveterinaria.Repository;


import br.edu.cesmac.clinicaveterinaria.domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultasRepository extends JpaRepository<Consulta, Long> {
}