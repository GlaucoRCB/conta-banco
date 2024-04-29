//import da biblioteca Scanner para utilização nos inputs
//import da biblioteca Locale para utilização nos valores númericos
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o Scanner e definindo o Locale
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        //Solicitação das informações do Usuário para criação de conta
        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o valor que deseja inserir: ");
        double saldo = scanner.nextDouble();

        System.out.println("");

        //Exibição das mensagem de sucesso ao criar conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + "R$ já está disponível para saque!");

    }
}
