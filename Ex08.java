import java.util.Scanner;

public class Ex08 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = CalcMedia.calcularMedia(nota1, nota2, nota3);

        String mencao = CalcMedia.determinarMencao(media);

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do aluno: " + media);
        System.out.println("Menção: " + mencao);

        scanner.close();
    }
}