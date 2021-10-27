package br.com.fatec.engsoftware.designpatterns.semana07.facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combo cmb = new Combo(1);
        cmb.itensCombo(); //Menu Opções
        System.out.println("\nDigite o código da sua escolha: ");
        int comida = sc.nextInt();
        int sobremesa = sc.nextInt();
        int bebida = sc.nextInt();

        cmb.criacaoCombo(comida, sobremesa, bebida);
     //Código teste//cmb.criacaoCombo(2, 4, 8);

        sc.close();

    }
}
