package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.List;

public class PratoPrincipal {
    private List<Item> list;

    public PratoPrincipal(List<Item> list) {
        this.list = list;
    }

    public void Adicionar(List<Item> list) {
        this.list.add((Item) list);
    }

    public List<Item> getList() {
        return list;
    }

    public void Remover(List<Item> list){
        this.list.remove(list);
    }

    @Override
    public String toString() {
        return "PratoPrincipal{" +
                "list=" + list +
                '}';
    }
}
