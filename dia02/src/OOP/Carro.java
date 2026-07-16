package OOP;

public class Carro {
    //Propriedades | atributos | campos | variaveis de instância
    String cor;
    String placa;

    //Métodos = comportamento do objeto
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    public void frear (){
        System.out.println("O carros está freando");
    }

    public void abastecer(){
        System.out.println("O carros está sendo abastecido");
    }

    //-------------------------------------------------------------------
    // gettler e setters

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }




}
