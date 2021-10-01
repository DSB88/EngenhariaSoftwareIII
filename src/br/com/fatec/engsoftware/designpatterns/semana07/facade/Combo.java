package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combo {
    private List<Item> item = new ArrayList<>(3);
    private PratoPrincipal pratoPrincipal = new PratoPrincipal(item);
    private int numero;

    public Combo(int numero) {
        this.numero = numero;
    }

    public void criacaoCombo(String comida, String sobremesa, String bebida) {
        ArrayList<String> combo = new ArrayList<>(3);
        combo.add(comida);
        combo.add(sobremesa);
        combo.add(bebida);

        System.out.println("\nSeu pedido foi: ");
        for(String pedido : combo){
            System.out.println(pedido);
        }
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

        for(String itens : menuItens){
            System.out.println(itens);
        }
    }
}
