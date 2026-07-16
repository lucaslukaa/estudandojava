import OOP.Carro;

import java.util.Scanner;

/*
Orientação a objetos
POO = Programação orientada a Objetos
OOP = Object Oriented Programming

Classe = um modelo que a partir dela vamos criar o objeto;
Propriedade: Cada objeto vai ter a sua propriedade/característica;
Métodos: o comportamento/ações do objeto;

A proposta é aproximar o mundo digital do mundo real
Tudo que a gente for criar em OOP vai ser um objeto
 */
 public class Main {
     public static void main(String[] args) {

         //scanner entradeUsuario = new Scanner(System.in);


         //Criando o objeto
         Carro carro = new Carro();
         carro.setCor("Vermelho");
         carro.setPlaca("BR2Z19");
         carro.acelerar();

         System.out.println("" + carro.getPlaca() + "\n" + carro.getCor() );
     }
}