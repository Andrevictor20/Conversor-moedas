import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        ConversorMoedas conversor = new ConversorMoedas();
        
        while (opcao != 7) {
            Menu menu = new Menu();
            menu.exibirMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 7) {
                System.out.println("Obrigado por usar o Conversor de Moeda!");
                break;
            }

            if (opcao < 1 || opcao > 6) {
                System.out.println("Opção inválida!");
                continue;
            }

            String moedaOrigem, moedaDestino, mensagem;
            
            switch (opcao) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    mensagem = "Digite o valor em dólar: ";
                    break;
                case 2:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    mensagem = "Digite o valor em peso argentino: ";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    mensagem = "Digite o valor em dólar: ";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    mensagem = "Digite o valor em real brasileiro: ";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                    mensagem = "Digite o valor em dólar: ";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    mensagem = "Digite o valor em peso colombiano: ";
                    break;
                default:
                    continue;
            }
            
            System.out.println(mensagem);
            double valorBase = Double.parseDouble(scanner.nextLine());
            System.out.println(conversor.ConverterMoedas(valorBase, moedaOrigem, moedaDestino));
        }
    }
    

}