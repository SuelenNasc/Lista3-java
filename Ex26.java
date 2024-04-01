import java.util.Scanner;

class Ex26 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (Baixo/Médio/Alto):");
        String grupoRisco = scanner.next();

        Seguradora pessoa = new Seguradora(nome, idade, grupoRisco);
        pessoa.determinarCategoria();

        scanner.close();
    }
}