import java.util.Scanner;

class Veiculo {
    private String combustivel;

    public Veiculo(String combustivel) {
        this.combustivel = combustivel;
    }

    public double calcularDesconto(double valorVeiculo) {
        double desconto = 0;
        switch (combustivel.toLowerCase()) {
            case "álcool":
                desconto = valorVeiculo * 0.25;
                break;
            case "gasolina":
                desconto = valorVeiculo * 0.21;
                break;
            case "diesel":
                desconto = valorVeiculo * 0.14;
                break;
            default:
                System.out.println("Combustível inválido.");
        }
        return desconto;
    }
}