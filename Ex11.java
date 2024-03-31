import java.util.Scanner;

public class Ex11 {


public static void executar () {
    Scanner scanner = new Scanner(System.in);

    int totalHomens = 0;
    int totalMulheres = 0;

    for (int i = 0; i < 56; i++) {
        System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine(); 

        Pessoa pessoa = new Pessoa(nome, sexo);
        System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());

        if (sexo == 'M') {
            totalHomens++;
        } else if (sexo == 'F') {
            totalMulheres++;
        }
    }

    System.out.println("Total de homens: " + totalHomens);
    System.out.println("Total de mulheres: " + totalMulheres);

    scanner.close();
}
}