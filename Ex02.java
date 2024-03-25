import java.util.Scanner;

public class Ex02 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivel);

        double consumoMedio = automovel.calcularConsumoMedio();

        System.out.println("\nConsumo médio do automóvel: " + consumoMedio + " km/l");

        scanner.close();
    }
}