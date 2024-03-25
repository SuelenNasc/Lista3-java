import java.util.Scanner;

public class Ex04 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolar = scanner.nextDouble();

        ConversorDolar conversor = new ConversorDolar(cotacaoDolar, quantidadeDolar);


        double valorEmReais = conversor.calcularValorEmReais();

        // Exibe o valor em reais
        System.out.println("\nValor em reais: R$" + valorEmReais);

        scanner.close();
    }
}