public class Operadores {
    public static void main(String[] args) {
        //Operadores unários positivos e negativos
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * - 1;

        System.out.println(numero);


        // Incremento de números
        // x repetições

        numero++;
        // numero = numero + 1;

        System.out.println( ++ numero); //Colocando os operadores primeiro, imprime o número já com o incremento

        //Negação de valores
        boolean variavel  = true;
        System.out.println(!variavel);

        variavel = !variavel; //maneira mais segura de realizar a inversão de valores de uma variavel
        System.out.println(variavel);

        //Operador ternário
        int a = 5;
        int b = 6;

        //Duas maneiras distintas de realizar uma validação
        String resultado = a==b?"verdadeiro":"falso";

        System.out.println(resultado);

        if(a==b){
            resultado = "verdadeiro!";
        } else {
            resultado = "falso!";
        }

        System.out.println(resultado);

        //Operadores relacionais

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira!");
        }

        System.out.println("Número 1 é igual ao número 2?\n" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número 1 é difernte do número 2?\n" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Número 1 é maior que o número 2?\n" + simNao);

        simNao = numero1 < numero2;

        System.out.println("Número 1 é menor que o número 2?\n" + simNao);

        String nomeUm = "Walter";
        String nomeDois = "Walter";

        System.out.println(nomeUm == nomeDois);

        //É comum que para compararmos objetos e textos utilizemos do equals para isso
        System.out.println("Nome 1 é igual ao nome 2? " + nomeUm.equals(nomeDois));

        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras!");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras!");
        }

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras!");
        }
    }
}
