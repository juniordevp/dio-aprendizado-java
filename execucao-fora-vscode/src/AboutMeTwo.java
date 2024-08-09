import java.util.Locale;
import java.util.Scanner;

/**
 * Este programa visa facilitar a interação do usuário e previnir 
 * erros de preenchimento das informações utilizando a classe
 * Scanner que faz com que o usuário possa preencher através do
 * terminal.
 * 
 * @author Walter Junior
 * @since 09/08/2024
 */
public class AboutMeTwo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " " + sobrenome + 
                            "\nVocê tem " + idade + " anos" + 
                            "\nE tem " + altura + " de altura!");
    }
}
