package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal;

public class Dividir implements ICalcular {
    @Override
    public int calcular(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.print("Erro, na divisão, calculo não possível! " +
                    "\nErro relatado: "+e );
            return 0;
        }
    }
}

