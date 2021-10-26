package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class MediaGeometrica implements ICalcMedia {
    @Override
    public float CalculaMedia(float a, float b) {
       return ((float) Math.sqrt(a * b));
    }
}