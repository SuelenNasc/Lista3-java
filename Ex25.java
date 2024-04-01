import java.util.Scanner;

public class Ex25 {
    
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int numeroMatricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacao = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExame = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, numeroMatricula, notaLaboratorio, notaAvaliacao, notaExame);
        double notaFinal = estudante.calcularNotaFinal();
        String classificacao = estudante.determinarClassificacao(notaFinal);

        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}