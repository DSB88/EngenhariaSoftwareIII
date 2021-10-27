package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

public class MediaGeometrica implements ICalcMedia, IMudaSituacao {
    @Override
    public float CalculaMedia(float a, float b) {
       return ((float) Math.sqrt(a * b));
    }

    @Override
    public void MudaSituacao(float resultado) {
        System.out.println(resultado > 7 ? "Média Geométrica: Aprovado" : "Média Geométrica: Reprovado");
    }
}