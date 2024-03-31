import java.util.Scanner;

public class Ex12 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;
        do {
            System.out.println("Digite o ano do carro:");
            int ano = scanner.nextInt();

            Carro carro = new Carro(ano);

            double desconto = carro.calcularDesconto();
            double valorOriginal = 10000; 
            double valorComDesconto = valorOriginal - (valorOriginal * desconto);

            System.out.println("Valor do desconto: " + (desconto * 100) + "%");
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}