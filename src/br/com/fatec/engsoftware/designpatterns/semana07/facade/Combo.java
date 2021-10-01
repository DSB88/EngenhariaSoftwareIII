package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private Item item = new Item(0, null, 0);
    private PratoPrincipal pratoPrincipal = new PratoPrincipal(null);
    private int numero;

    public Combo(int numero) {
        this.numero = numero;
    }


    public void criacaoCombo(int comida, int sobremesa, int bebida) {
        Item item2 = new Item(0, null, 0);
        Item item3 = new Item(0, null, 0);

        if (comida == 1) {
            item.setCodigo(1);
            item.setDescricao("Macarrão ao molho");
            item.setPreco(15.99);
        } else if (comida == 2) {
            item.setCodigo(2);
            item.setDescricao("Feijoada");
            item.setPreco(15.99);
        } else if (comida == 3) {
            item.setCodigo(3);
            item.setDescricao("Caesar salad");
            item.setPreco(15.99);
        }

        if (sobremesa == 4) {
            item2.setCodigo(4);
            item2.setDescricao("sorvete de flocos em pote 250ml");
            item2.setPreco(7.99);
        } else if (sobremesa == 5) {
            item2.setCodigo(5);
            item2.setDescricao("frutas com calda de morango em pote 300ml");
            item2.setPreco(7.99);
        } else if (sobremesa == 6) {
            item2.setCodigo(6);
            item2.setDescricao("frutas da estação");
            item2.setPreco(7.99);
        }

        if (bebida == 7) {
            item3.setCodigo(7);
            item3.setDescricao("Coca Cola 600 ml");
            item3.setPreco(5.95);
        } else if (bebida == 8) {
            item3.setCodigo(8);
            item3.setDescricao("Pepsi 600 ml ");
            item3.setPreco(5.95);
        } else if (bebida == 9) {
            item3.setCodigo(9);
            item3.setDescricao("Suco natural 350 ml");
            item3.setPreco(5.95);
        }

        List<Item> itens = new ArrayList<>(3);
        itens.add(item);
        itens.add(item2);
        itens.add(item3);

        PratoPrincipal pratoPrincipal = new PratoPrincipal(itens);
        double soma = 0;
        soma = item.getPreco() + item2.getPreco() + item3.getPreco();
        System.out.println("\nSeu pedido foi: ");
        for (Object pedido : itens) {
            System.out.println(pedido);
        }
        System.out.printf("O total da conta foi: R$ %.2f", soma);
    }

    public void itensCombo() {
        menuItem();
    }

    @Override
    public String toString() {
        return "Combo: " + "item: " + item + " pratoPrincipal= " + pratoPrincipal + " numero= " + numero;
    }

    private void menuItem() {
        ArrayList<String> menuItens = new ArrayList<>(9);
        menuItens.add("--------------Menu de Opções----------------");
        menuItens.add("01 - Prato Principal: Macarrão ao molho ");
        menuItens.add("02 - Prato Principal: Feijoada ");
        menuItens.add("03 - Prato Principal: Caesar salad ");
        menuItens.add("04 - Sobremesa: sorvete de flocos em pote 250ml ");
        menuItens.add("05 - Sobremesa: frutas com calda de morango em pote 300ml ");
        menuItens.add("06 - Sobremesa: frutas da estação ");
        menuItens.add("07 - Bebida: Coca Cola 600 ml ");
        menuItens.add("08 - Bebida: Pepsi 600 ml ");
        menuItens.add("09 - Bebida: Suco natural 350 ml ");

        for (String itens : menuItens) {
            System.out.println(itens);
        }
    }
}