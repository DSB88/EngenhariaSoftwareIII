package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getResultado(ICalcular calcular){
        return calcular.calcular(num1,num2);
    }
}
