import java.util.Scanner;

class ConversorDolar {
    private double cotacaoDolar;
    private double quantidadeDolar;

    public ConversorDolar(double cotacaoDolar, double quantidadeDolar) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }

    public double calcularValorEmReais() {
        return cotacaoDolar * quantidadeDolar;
    }
}
