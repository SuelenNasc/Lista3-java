import java.util.Scanner;

public class Ex05 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        Prestacoes prestacoes = new Prestacoes(valorCompra);

        double valorPrestacao = prestacoes.calcularValorPrestacao();

        System.out.println("\nValor de cada prestação: R$" + valorPrestacao);

        scanner.close();
    }
}
