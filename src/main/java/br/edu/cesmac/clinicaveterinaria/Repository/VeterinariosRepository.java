package br.edu.cesmac.clinicaveterinaria.Repository;

import br.edu.cesmac.clinicaveterinaria.domain.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinariosRepository extends JpaRepository<Veterinario, Long> {
}
