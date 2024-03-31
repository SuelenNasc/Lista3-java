import java.util.Scanner;

public class Ex16 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double totalReajuste = 0;

        for (int i = 1; i <= 584; i++) {
            System.out.println("Digite o salário do funcionário " + i + ":");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(salario, salarioMinimo);
            double reajuste = funcionario.calcularReajuste();
            totalReajuste += reajuste;

            System.out.println("Reajuste para o funcionário " + i + ": R$" + reajuste);
        }

        System.out.println("\nTotal de reajuste dado aos funcionários: R$" + totalReajuste);

        scanner.close();
    }
}
