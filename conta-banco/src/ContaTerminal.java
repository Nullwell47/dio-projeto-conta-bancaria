import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scaanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        //Exibir a mensagem conta criada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                          saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
