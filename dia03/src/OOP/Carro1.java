package OOP;

public class Carro1 {
    //Propriedades
    String cor; // variavel de instancia
    String placa; // variavel de instancia

    //variavel de classe imutavel
    static String pais; //variavel de classe imutavel
    // ela vai ter valor único e não vai ficar associado ao constructor

    //métodos - comportamentos
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void desacelerar(){
        System.out.println("Desacelando");
    }
    public void abastecendo(){
        System.out.println("Abastecendo");
    }

    //constructor
    public Carro1(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;

    }

    public void detalhesCarro(){
        System.out.println("O carro tem a cor " + cor + " e o numero da placa é: "+placa);

    }

    public void paisdeOrigem(String pais){
        this.pais = pais;
        System.out.println("O carro tem origem: " + pais);
    }
}
