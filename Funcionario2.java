import java.util.Scanner;

class Funcionario2 {
    private String nome;
    private double salario;

    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularReajuste(double salarioMinimo) {
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

    public double getNovoSalario(double reajuste) {
        return salario + reajuste;
    }
}