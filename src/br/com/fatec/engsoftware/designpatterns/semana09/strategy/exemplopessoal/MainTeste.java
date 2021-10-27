package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class MainTeste {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora(10,0);
        System.out.println(cal.getResultado(new Soma()));
        System.out.println(cal.getResultado(new Subtrair()));
        System.out.println(cal.getResultado(new Dividir()));
        System.out.println(cal.getResultado(new Multiplicar()));

    }
}
