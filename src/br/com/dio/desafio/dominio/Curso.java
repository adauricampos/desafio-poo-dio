package br.com.dio.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {

    }


    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public void setDescriçao(String descricao_curso_poo_java) {

    }



}
