import java.util.Scanner;

public class Ex13 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastrar?");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int totalAptos = 0;
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("A pessoa " + nome + " está com boa saúde? (true/false):");
            boolean saude = scanner.nextBoolean();
            scanner.nextLine(); 

            Pessoa2 pessoa = new Pessoa2(nome, sexo, idade, saude);
            if (pessoa.estaApta()) {
                totalAptos++;
                if (pessoa.getSexo() == 'M') {
                    totalHomens++;
                } else {
                    totalMulheres++;
                }
            }
        }

        System.out.println("\nTotal de pessoas aptas para o serviço militar obrigatório: " + totalAptos);
        System.out.println("Total de homens aptos: " + totalHomens);
        System.out.println("Total de mulheres aptas: " + totalMulheres);

        scanner.close();
    }
}