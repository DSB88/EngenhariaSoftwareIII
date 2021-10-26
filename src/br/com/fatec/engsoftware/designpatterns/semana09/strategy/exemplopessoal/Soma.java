package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

import br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula.ICalcMedia;

public class Soma implements ICalcular {
    @Override
    public int calcular(int a, int b) {
        return a+b;
    }
}
