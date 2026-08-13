import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
            System.out.println("Digite o saldo da sua conta:");
        int saldo = scanner.nextInt();
            System.out.println("Digite o valor da transacao que deseja fazer:");
        int valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada
        if (saldo >= valorTransacao) {

            System.out.println("Transacao aprovada");

        } else {

            System.out.println("Saldo insuficiente");

        }
        scanner.close();
    }
}