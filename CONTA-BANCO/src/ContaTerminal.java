
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        String sobrenomeCliente;
        double saldo = 237.48;

        System.out.println("BEM-VINDO AO BANCO!");

        System.out.println("Por Favor, digite o número da sua Conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por Favor, digite o número da sua Agência:");
        agencia = scanner.next();

        System.out.println("Por Favor, digite o seu nome:");
        nomeCliente = scanner.next();

        System.out.println("Por Favor, digite o seu sobrenome:");
        sobrenomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", Obrigado por fazer parte do nosso banco, sua agência é " + agencia + ", conta é " + numeroConta + ", e seu saldo é " + saldo);
    }
}
