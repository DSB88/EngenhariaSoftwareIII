package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class Main {

    public static void main(String[] args) {
        System.out.println("Implemente aqui o código para demonstrar o design Patter Strategy");
        Disciplina disciplina = new Disciplina(8,9);

        System.out.println(disciplina.getResultado(new MediaAritmetica()));
        System.out.println(disciplina.getResultado(new MediaGeometrica()));


    }
}

