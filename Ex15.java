import java.util.Scanner;

public class Ex15 {
    
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar:");
            String combustivel = scanner.nextLine().toLowerCase();

            if (combustivel.equals("zero")) {
                break;
            }

            System.out.println("Digite o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();
            scanner.nextLine();

            Veiculo veiculo = new Veiculo(combustivel);
            double desconto = veiculo.calcularDesconto(valorVeiculo);
            totalDesconto += desconto;

            double valorPago = valorVeiculo - desconto;
            totalPago += valorPago;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
        }

        System.out.println("\nTotal de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        scanner.close();
    }
}