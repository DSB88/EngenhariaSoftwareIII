package br.com.fatec.engsoftware.designpatterns.semana07.facade;

public class Main {
    public static void main(String[] args) {
     Combo cmb = new Combo(1);
     cmb.itensCombo(); //Menu Opções
     cmb.criacaoCombo("Macarrão ao molho","sorvete de flocos em pote 250ml","Pepsi 600ml");
    }
}
