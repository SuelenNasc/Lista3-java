import java.util.Scanner;

public class Ex20 {
    
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        double valorHoraAula;
        switch (nivel) {
            case 1:
                valorHoraAula = 12.0;
                break;
            case 2:
                valorHoraAula = 17.0;
                break;
            case 3:
                valorHoraAula = 25.0;
                break;
            default:
                System.out.println("Nível inválido. Utilizando valor padrão de R$12,00 por hora/aula.");
                valorHoraAula = 12.0;
        }

        System.out.println("Digite a quantidade de horas/aula trabalhadas:");
        int horasAula = scanner.nextInt();

        Professor professor = new Professor(nivel, valorHoraAula);
        double salario = professor.calcularSalario(horasAula);

        System.out.println("Salário do professor: R$" + salario);

        scanner.close();
    }
}