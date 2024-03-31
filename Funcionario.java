import java.util.Scanner;

class Funcionario {
    private double salario;
    private double salarioMinimo;

    public Funcionario(double salario, double salarioMinimo) {
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularReajuste() {
        double reajuste = 0;

        if (salario < 3 * salarioMinimo) {
            reajuste = salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario < 10 * salarioMinimo) {
            reajuste = salario * 0.2;
        } else if (salario >= 10 * salarioMinimo && salario < 20 * salarioMinimo) {
            reajuste = salario * 0.15;
        } else {
            reajuste = salario * 0.1;
        }

        return reajuste;
    }
}