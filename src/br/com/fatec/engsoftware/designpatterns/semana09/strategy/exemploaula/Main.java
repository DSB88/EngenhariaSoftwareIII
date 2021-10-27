package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Design Patter Strategy");
        System.out.println("----------------------");
        Disciplina matematica = new Disciplina(7,8);

        //Cálculo
        matematica.getResultado(new MediaAritmetica());
        matematica.getResultado(new MediaGeometrica());

        //Mensagem baseada no cálculo
        matematica.getSituacao(new MediaAritmetica());
        matematica.getSituacao(new MediaGeometrica());
        System.out.println();

    }
}

