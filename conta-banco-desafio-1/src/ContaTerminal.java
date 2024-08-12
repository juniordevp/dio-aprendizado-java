import java.util.Scanner;
import java.util.Locale;

/**
 * Esse código visa aplicar todos os conhecimentos adiquiridos até o presente momento
 * (10/08/2024) em uma simples aplicação de registrar algumas informações bancárias fictícias
 * e imprimir uma mensagem na tela.
 * 
 * @author Walter Junior
 * @since 10/08/2024
 * @version 1.0
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, para realizar seu cadastro vamos precisar de alguma informações.\n");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da agência:\n (EX: 123-4)");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo a ser depositado:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                            ", conta " + numeroConta + " e seu saldo é de " + saldo + " já está disponível para saque!");
    }
}
