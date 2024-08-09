public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        /**
         * Já neste exemplo, será bem semelhante a execução
         * Seguindo todos os passos do exemplo anterior, ao
         * chegar na execução do programa iremos acrescentar algumas coisas.
         * Exemplo: java AboutMe {seuNome} {seuSobrenome} {suaIdade} {sua Altura}
         *          java AboutMe Walter Moraes 20 1.75
         * Dessa maneira o programa irá ser executado corretamente!!
         */
    }
}
