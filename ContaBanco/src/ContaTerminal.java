import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {    

    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência e aperte (enter)! ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da Conta e aperte (enter)! ");
        int numero = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Por favor, digite o Nome do Cliente e aperte (enter)! ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da conta (123.45) e aperte (enter)! ");
        double saldo = scanner.nextDouble();        

        //Exibir a mensagem conta criada
        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");

    }
}
