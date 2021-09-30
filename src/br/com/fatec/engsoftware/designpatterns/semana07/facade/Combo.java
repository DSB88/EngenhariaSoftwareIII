package br.com.fatec.engsoftware.designpatterns.semana07.facade;

public class Combo {
    private Item item;
    private PratoPrincipal pratoPrincipal;
    private int numero;

    public Combo(int numero) {
        this.item = item;
        this.pratoPrincipal = pratoPrincipal;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "item=" + item +
                ", pratoPrincipal=" + pratoPrincipal +
                ", numero=" + numero +
                '}';
    }
}
