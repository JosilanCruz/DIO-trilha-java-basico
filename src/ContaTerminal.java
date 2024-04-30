import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero da conta: ");
        int numero = scn.nextInt();
        System.out.println("Por favor, informe a agencia: ");
        String agencia = scn.next();
        System.out.println("Por favor, informe o seu nome: ");
        String nome = scn.next();
        System.out.println("Por favor, informe o saldo: ");
        double saldo = scn.nextDouble();
        System.out.println("\"Olá "+nome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}