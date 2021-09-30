package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item = new Item(1, "sorvete", 6.00);
        Item item2 = new Item(2, "pipoca", 4.00);
        Item item3 = new Item(3, "refrigerante", 3.50);
        Item item4 = new Item(4,"chocolate",4.50);

        ArrayList<Item> itemList = new ArrayList<>(5);
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
//        for(Item itens : itemList){
//            System.out.println(itens);
//        }
        PratoPrincipal pratoPrincipal = new PratoPrincipal(itemList);
        System.out.println(pratoPrincipal.getList());
        Combo cmb = new Combo(1);

        System.out.println(cmb);

    }
}
