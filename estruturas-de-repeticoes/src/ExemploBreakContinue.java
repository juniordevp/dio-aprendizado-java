public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
                //continue; Pode ser uma maneira de desconsiderar quando um situação é verdadeira
            }
            System.out.println(numero);
        }
    }
}
