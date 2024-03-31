import java.util.Scanner;

public class Ex14 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        double somaCusto = 0;
        double somaVenda = 0;
        int totalProdutos = 40;

        for (int i = 1; i <= totalProdutos; i++) {
            System.out.println("Produto " + i);
            System.out.println("Digite o preço de custo:");
            double custo = scanner.nextDouble();

            System.out.println("Digite o preço de venda:");
            double venda = scanner.nextDouble();

            Produto produto = new Produto(custo, venda);
            String resultado = produto.verificarLucroPrejuizoEmpate();
            System.out.println("Resultado para o Produto " + i + ": " + resultado);

            somaCusto += produto.getPrecoCusto();
            somaVenda += produto.getPrecoVenda();
        }

        double mediaCusto = somaCusto / totalProdutos;
        double mediaVenda = somaVenda / totalProdutos;

        System.out.println("\nMédia de preço de custo: " + mediaCusto);
        System.out.println("Média de preço de venda: " + mediaVenda);

        scanner.close();
    }
}