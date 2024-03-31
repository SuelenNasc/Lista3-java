import java.util.Scanner;

public class Ex07 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoConsumidor = CalcCustoCarro.calcularCustoConsumidor(custoFabrica);

        System.out.println("O custo ao consumidor do carro é: R$ " + String.format("%.2f", custoConsumidor));

        scanner.close();
    }
}