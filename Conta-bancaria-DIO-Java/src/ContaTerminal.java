import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println("App Banco DIO");
        System.out.println("------------");
        System.out.println();
        System.out.println("Bem vindo ao aplicativo do banco DIO!");
        System.out.println();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Para iniciar seu atendimento, por favor digite o número de sua conta (formato ****): ");

        int numero_da_conta = teclado.nextInt();

        System.out.println();
        System.out.print("Digite o número da sua agência (formato ***-*): ");

        teclado.nextLine();

        String numero_da_agencia =  teclado.nextLine();

        System.out.println();
        System.out.print("Digite o seu nome completo, com todas as letras maiúsculas: ");

        String nome =teclado.nextLine();

        System.out.println();
        System.out.print("Digite o seu saldo no formato (****.**): ");
        String saldo_str = teclado.nextLine().replace(",", ".");
        float saldo = Float.parseFloat(saldo_str);

        System.out.println("------------");
        System.out.printf("Olá %s, dono da conta N %d, agência N %s. Seu saldo é de RS %.2f.", nome, numero_da_conta, numero_da_agencia, saldo );

    }
}
