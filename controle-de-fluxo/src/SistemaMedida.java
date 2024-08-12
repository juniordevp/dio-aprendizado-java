/**
 * Este código apresenta o uso do recurso de linguagem o SWITCH-CASE.
 */

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }
    }
}
