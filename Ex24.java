import java.util.Scanner;

public class Ex24 {
    
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacao = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExame = scanner.nextDouble();

        double notaFinal = CalculoNota.calcularNotaFinal(notaLaboratorio, notaAvaliacao, notaExame);
        System.out.println("Nota final do estudante: " + notaFinal);

        scanner.close();
    }
}