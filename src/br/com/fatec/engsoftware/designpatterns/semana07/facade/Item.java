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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", " + "Descrição: " + descricao + ", " + "Preço " + preco;
    }
}

