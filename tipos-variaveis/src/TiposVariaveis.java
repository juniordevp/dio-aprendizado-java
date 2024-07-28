public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;

        String meuNome = "Walter Junior";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero  = 5;

        numero = 10;

        System.out.println(numero);

        //Para determinarmos uma constante é necessário que utilizemos da key ´final´
        final double VALOR_DE_PI = 3.14;
    }
}
