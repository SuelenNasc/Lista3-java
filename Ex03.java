import java.util.Scanner;

public class Ex03 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

        double salarioFinal = vendedor.calcularSalarioFinal();

        System.out.println("\nNome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário final no final do mês: R$" + salarioFinal);

        scanner.close();
    }
}
