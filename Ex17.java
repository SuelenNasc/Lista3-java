import java.util.Scanner;

public class Ex17 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        Funcionario2 funcionario = new Funcionario2(nome, salario);
        double reajuste = funcionario.calcularReajuste(salarioMinimo);
        double novoSalario = funcionario.getNovoSalario(reajuste);

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

        scanner.close();
    }
}