package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class Dividir implements ICalcular {
    @Override
    public int calcular(int a, int b) {
        try {
            return a/b;
        }catch (Exception e){
            System.err.println("Erro, divisão não possível!");
            return 0;
        }
    }
}
