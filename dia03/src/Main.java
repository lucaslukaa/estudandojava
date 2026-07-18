import OOP.Carro1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner entradaUsuario = new Scanner(System.in);

        Carro1 carro1 = new Carro1("azul", "bra1234");
        carro1.detalhesCarro();
        carro1.paisdeOrigem("Brasil");
        carro1.acelerar();

        Carro1 carro2 = new Carro1("vermelho", "RI1234");
        carro2.detalhesCarro();
        carro2.paisdeOrigem("Brasil");
        carro2.abastecendo();

        System.out.println();
    }
}

