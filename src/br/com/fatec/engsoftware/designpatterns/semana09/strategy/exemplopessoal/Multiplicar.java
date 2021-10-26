package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class Multiplicar implements ICalcular{
    @Override
    public int calcular(int a, int b) {
        return a*b;
    }
}
