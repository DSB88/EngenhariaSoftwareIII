package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class Subtrair implements ICalcular{
    @Override
    public int calcular(int a, int b) {
        return a-b;
    }
}
