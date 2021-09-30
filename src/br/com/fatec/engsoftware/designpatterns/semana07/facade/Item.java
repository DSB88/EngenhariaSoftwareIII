package br.com.fatec.engsoftware.designpatterns.semana07.facade;

public class Item {
    private int codigo;
    private String descricao;
    private double preco;

    public Item(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
