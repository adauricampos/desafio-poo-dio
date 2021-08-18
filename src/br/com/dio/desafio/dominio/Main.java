package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descricao curso POO java");
        curso1.setCargaHoraria(8);

        Curso curso2;
        curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descricao curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria() {
            @Override
            public void setDescriçao(String descricao_curso_poo_java) {

            }
        };
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdauri = new Dev();
        devAdauri.setNome("Adauri");
        devAdauri.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Adauri:" + devAdauri.getConteudosInscritos());

        devAdauri.progredir();
        devAdauri.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Adauri:" + devAdauri.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Adauri:" + devAdauri.getConteudosConcluidos());
        System.out.println("XP:" + devAdauri.calcularTotalXp());

        System.out.println("-------");

        Dev devJurema = new Dev();
        devJurema.setNome("Jurema");
        devJurema.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jurema:" + devJurema.getConteudosInscritos());

        devJurema.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jurema:" + devJurema.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Jurema:" + devJurema.getConteudosConcluidos());
        System.out.println("XP:" + devJurema.calcularTotalXp());
    }
}
