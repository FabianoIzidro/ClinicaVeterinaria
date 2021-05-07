package br.edu.cesmac.clinicaveterinaria.Resources;

import java.net.URI;
import java.util.List;

import br.edu.cesmac.clinicaveterinaria.Service.VeterinariosService;
import br.edu.cesmac.clinicaveterinaria.domain.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/veterinarios")
public class VeterianriosResources {

    @Autowired
    private VeterinariosService veterinariosService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Veterinario> buscarPorId(@PathVariable("id") Long idVeterinario) throws Exception {
        Veterinario veterinario = veterinariosService.buscarPorId(idVeterinario);
        return ResponseEntity.ok(veterinario);

    }

    @GetMapping
    public List<Veterinario> listar() {
        return veterinariosService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Veterinario veterinario) {
        veterinariosService.salvar(veterinario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(veterinario.getIdVeterinario()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Veterinario veterinario) {
        veterinariosService.atualizar(veterinario);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idVeterinario) throws Exception {
        veterinariosService.deletarPorId(idVeterinario);
    }

}