import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome e o seu tipo de conta: Ex: Nathan, investimento");

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");
        String nome = partes[0];
        String tipoConta = partes[1];

        // TODO: Verifique se o tipo de conta é válido ("corrente", "poupanca" ou "investimento")
        // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.
        if (tipoConta.equals("corrente") ||
                tipoConta.equals("poupanca") ||
                tipoConta.equals("investimento")) {

            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome, tipoConta);

        } else {

            System.out.println("Tipo de conta invalido.");

        }
        scanner.close();
    }
}