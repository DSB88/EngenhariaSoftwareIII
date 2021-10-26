package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class MediaAritmetica implements ICalcMedia{
    @Override
    public float CalculaMedia(float a, float b) {
        return (a+b) / 2;
    }
}
