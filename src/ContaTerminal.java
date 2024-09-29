import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Por Favor digite o numero da Agencia:");
    agencia = scanner.next();
    scanner.nextLine();
    System.out.println("Por Favor digite o numero da sua conta:");
    numero = scanner.nextInt();
    System.out.println("Por Favor digite o seu Nome:");
    nomeCliente = scanner.next();
    scanner.nextLine();
    System.out.println("Por Favor digite o seu saldo:");
    saldo = scanner.nextDouble();

    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia);
    System.out.println("Sua conta é "+numero+ " e seu saldo "+saldo+ " ja esta disponível para saque.");

  }
}