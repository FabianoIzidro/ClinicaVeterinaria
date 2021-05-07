package br.edu.cesmac.clinicaveterinaria.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;
    private String DataAbertura;
    private String NumeroRegistro;
    private String anamnese;

    public Consulta () {
    }

    public Consulta (Long idConsulta , String DataAbertura, String NumeroRegistro, String anamnese ) {
        this.idConsulta = idConsulta;
        this.DataAbertura = DataAbertura;
        this.NumeroRegistro = NumeroRegistro;
        this.anamnese = anamnese;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.DataAbertura = dataAbertura;
    }

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.NumeroRegistro = numeroRegistro;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }
}



