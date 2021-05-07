package br.edu.cesmac.clinicaveterinaria.Service;

import java.util.List;

import br.edu.cesmac.clinicaveterinaria.Repository.VeterinariosRepository;
import br.edu.cesmac.clinicaveterinaria.domain.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinariosService {

    @Autowired
    private VeterinariosRepository veterinariosRepository;

    public Veterinario salvar(Veterinario veterinario) {
        Veterinario veterinarioCriada = veterinariosRepository.save(veterinario);
        return veterinarioCriada;
    }

    public Veterinario atualizar(Veterinario veterinario) {
        Veterinario veterinarioAtualizada = veterinariosRepository.save(veterinario);
        return veterinarioAtualizada;
    }

    public void deletarPorId(Long id) throws Exception {
        Veterinario veterinarioExclusao = veterinariosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        veterinariosRepository.deleteById(id);
    }

    public Veterinario buscarPorId(Long id) throws Exception {
        return veterinariosRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Veterinario> listar() {
        return veterinariosRepository.findAll();
    }

}



