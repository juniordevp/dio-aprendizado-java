/**
 * Este código demonstra um caso no qual vale grandemente o uso do SWITCH-CASE
 * trazendo uma melhor praticidade.
 */

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5gb YouTube");
            }
            case "M": {
                System.out.println("Whats e Instagram Ilitmitado");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
