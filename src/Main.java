import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = "Walter White";
        String tipoConta = "Corrente";
        double saldo = 1000;
        int opcao = 0;

        System.out.println("----Informações Bancárias----");
        System.out.println("Nome Cliente: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------------------------");

        String menu = """
                ---Digite sua opção---
                1. Consultar Saldo
                2. Transferir Valor
                3. Receber Valor
                4. SAIR
                """;



        while (opcao != 4){
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir");
                double valor = leitor.nextDouble();

                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                }else {
                    saldo -= valor;
                    System.out.println("Transferência realizada!");
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja receber");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("Transferência realizada!");

            }else if (opcao == 4){
                System.out.println("Encerrando aplicação...");
            }else{
                System.out.println("Opção Inválida!");
            }
        }
    }
}