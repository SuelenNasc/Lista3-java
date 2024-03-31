import java.util.Scanner;

public class Ex18 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); 

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        Funcionario3 funcionario = new Funcionario3(nome, idade, sexo, salarioFixo);
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: R$" + salarioLiquido);

        scanner.close();
    }
}