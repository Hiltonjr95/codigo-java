import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agencia da conta");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do dono da conta");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite saldo da conta");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(numero + agencia + nomeCliente + saldo);

        scanner.close();



        
    }
}
