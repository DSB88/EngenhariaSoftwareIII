package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Design Pattern Strategy");
        System.out.println("----------------------");
        Disciplina matematica = new Disciplina(6.5f,7f);

        //Cálculo
        matematica.getResultado(new MediaAritmetica());
        matematica.getResultado(new MediaGeometrica());
//        System.out.println("Nota Média Aritmética: " + matematica.getResultado(new MediaAritmetica()));
//        System.out.println("Nota Média Geométrica: " +matematica.getResultado(new MediaGeometrica()));

        System.out.println("Resultado: ");
        //Mensagem baseada no cálculo
        matematica.getSituacao(new MediaAritmetica());
        matematica.getSituacao(new MediaGeometrica());
        System.out.println();

    }
}

