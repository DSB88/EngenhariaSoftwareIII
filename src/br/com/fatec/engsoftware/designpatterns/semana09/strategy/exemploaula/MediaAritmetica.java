package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class MediaAritmetica implements ICalcMedia, IMudaSituacao{
    @Override
    public float CalculaMedia(float a, float b) {
        return (a+b) / 2;
    }

    @Override
    public void MudaSituacao(float resultado) {
        System.out.println(resultado > 5 ? "Média Aritmética: Aprovado" : "Média Aritmética: Reprovado");
    }
}
