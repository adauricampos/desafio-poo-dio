package br.com.dio.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO = 20d;
    }

    public Mentoria() {

    }
}
