package br.edu.cesmac.clinicaveterinaria.Service;

import java.util.List;


import br.edu.cesmac.clinicaveterinaria.Repository.ConsultasRepository;
import br.edu.cesmac.clinicaveterinaria.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultasService {

    @Autowired
    private ConsultasRepository consultasRepository;

    public Consulta salvar(Consulta consulta) {
        Consulta consultaCriada = consultasRepository.save(consulta);
        return consultaCriada;
    }

    public Consulta atualizar(Consulta consulta) {
        Consulta consultaAtualizada = consultasRepository.save(consulta);
        return consultaAtualizada;
    }

    public void deletarPorId(Long id) throws Exception {
        Consulta consultaExclusao = consultasRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        consultasRepository.deleteById(id);
    }

    public Consulta buscarPorId(Long id) throws Exception {
        return consultasRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Consulta> listar() {
        return consultasRepository.findAll();
    }

}
