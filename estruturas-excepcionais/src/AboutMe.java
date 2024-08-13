import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Este código demonstra como devemos escrever códigos que podem gerar exceções
 * e assim trata-las.
 */

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome + 
                                ", tenho " + idade + " anos e minha altura é" + 
                                altura + " cm");
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
