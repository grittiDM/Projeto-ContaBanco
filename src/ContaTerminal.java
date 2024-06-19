import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitando ao usuario que digite seus dados
        System.out.println("Olá! Digite o numero da conta: ");
        int numero = scanner.nextInt();
        //Consumir o carctere de nova linha
        scanner.nextLine();

        System.out.println("Por favor, digite a agencia: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Agora, preciso que você digite o nome completo do cliente: ");
        //Utilizado o nextLine para possibilitar a utilização de mais de uma palavra separada por espaços
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta de número: " + numero + " e seu saldo: R$" + saldo + " já está disponível para saque.");
        
    }
}

