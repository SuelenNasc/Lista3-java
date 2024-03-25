import java.util.Scanner;

class Prestacoes {
    private double valorCompra;

    public Prestacoes(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public double calcularValorPrestacao() {
        return valorCompra / 5;
    }
}
