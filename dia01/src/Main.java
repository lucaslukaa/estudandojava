class Main {
    static void main(String[]args)
    {
        //Para criar uma variavel precisamos =  tipo de dado + identificação + valor atribuido
       /* String nome =  "Lucas H";
        String nomeSobrenome = "OLIVEIRA";
        System.out.println(nome);
        System.out.println(nomeSobrenome);
        */

        /*
            byte: -128 a 127(1 byte de informação ou 8bits)
            short: -32768 a 32767(2 bytes de informações ou 16 bits
            int: -2147483648 a 2147483647 (2bilhões) (4bytes de informações ou 32bits)
            long: -9223372036854775808 a 92233720368547755807 (8bytes de informações ou 64 bits)

          Números decimais

            float: 7 casas decimais
            double: 15 casas decimais

            string: vai receber textos
            char: suporta apenas um único caracter
         */

        //variaveis PRIMITIVAS = começa com a letra minuscula
        /*
        byte idade = 127; //127 é o maximo q aguenta
        short estoque = 32767; //32767 é o maximo
        int numero = 2147483647; // é o numero máximo
        long numEstrelas = 9223372036854775807L; //é necessário como o L (maiusculo) no final

        float real = 10.1234567f; //necessário colocar o f no final // só vai até 7 casas decimais
        double muitoDinheiro = 50.123456789123456; //até 15 casas decimais

        String name = "LUCAS";
        char minhaLetra = 'A'; // usar aspas Simples, só cabe 1 caracter, pode ser número

        var qualquerCoisa = 50.2130; // o var VAI identificar qual variavel é aquela, seja qual for;
        boolean qualEotrue = true;
        boolean desativado = false;
        */

        //Classes WRAPPERS = variaveis turbinadas que começa com a letra MAIUSCULA
        //Elas vão ter o mesmo RANGE do tipo primitivo
        //A diferença é que tem mais recursos, posso acessar métodos, funções...
        /*
        Byte idade = 120;
        Short estoque = 21767;
        Integer numero = 2147483647; // equivalento ao int
        Long numEstrelas = 9223372036854775807L;
        Float real = 10.1234567f;
        Double muitoDinheiro = 50.123456789123456;
        Character minhaLetra = 'A';//equiavalente ao char
        Boolean qualEotrue = true;
        System.out.println();
        */

        //VARIAVEIS MUTAVEIS E IMUTAVEIS

        //variavel mutavel ela começa com valor X e altera o valor conforme acontece uma ação
        byte idade =26;
        idade = 27;

        //variavel IMUTAVEL ela começa com valor X e se mantém
        final String NAME = "Carlos";// toda vez que usar a palavra FINAL ela fica IMUTÁVEL;
        //recomendável usar letra MAIUSCULA para declar o nome da variavel quando ela for constante/imutavel
    }
}
