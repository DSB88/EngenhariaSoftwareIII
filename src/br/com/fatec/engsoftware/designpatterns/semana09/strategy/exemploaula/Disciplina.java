package br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemploaula;

import br.com.fatec.engsoftware.designpatterns.semana09.strategy.exemplopessoal.ICalcular;

public class Disciplina {
    private float p1;
    private float p2;
    private float media;
    private String situacao;
    private String nome;
    ICalcMedia calculo;
    IMudaSituacao ajuste;

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina() {

    }

    public Disciplina(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public float getMedia() {
        return media;
    }

    public float getResultado(ICalcMedia iCalcMedia) {
        this.media = iCalcMedia.CalculaMedia(p1, p2);
        return iCalcMedia.CalculaMedia(p1, p2);
    }

    public void getSituacao(IMudaSituacao iMudaSituacao) {
        iMudaSituacao.MudaSituacao(getMedia());
    }
}


