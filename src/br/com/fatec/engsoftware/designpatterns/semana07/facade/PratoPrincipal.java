package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.List;

public class PratoPrincipal {
    private List<Item>itens;

    public PratoPrincipal(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> mostrarItens() {
        return itens;
    }

    public void adicionarItens(List<Item> itens) {
        this.itens = itens;
    }

    public void removerItens(List<Item> itens) {
        this.itens = itens;
    }
}
