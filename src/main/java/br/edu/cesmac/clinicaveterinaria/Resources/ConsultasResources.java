package br.edu.cesmac.clinicaveterinaria.Resources;

import java.net.URI;
import java.util.List;

import br.edu.cesmac.clinicaveterinaria.Service.ConsultasService;
import br.edu.cesmac.clinicaveterinaria.domain.Consulta;
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
@RequestMapping("/consultas")
public class ConsultasResources {

    @Autowired
    private ConsultasService consultasService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Consulta> buscarPorId(@PathVariable("id") Long idConsulta) throws Exception {
        Consulta consulta = consultasService.buscarPorId(idConsulta);
        return ResponseEntity.ok(consulta);

    }

    @GetMapping
    public List<Consulta> listar() {
        return consultasService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Consulta consulta) {
        consultasService.salvar(consulta);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(consulta.getIdConsulta()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Consulta consulta) {
        consultasService.atualizar(consulta);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idConsulta) throws Exception {
        consultasService.deletarPorId(idConsulta);
    }

}

