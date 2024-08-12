/**
 * Este código visa demonstrar o uso de um estrutura condicional ternária.
 */

public class ResultadoEscolar3 {
    public static void main(String[] args) {
        int nota = 4;

        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado!";
        System.out.println(resultado);
    }
}
