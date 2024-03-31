import java.util.Scanner;

class Funcionario3 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario3(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioLiquido() {
        double abono = 0;

        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100;
            } else {
                abono = 50;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200;
            } else {
                abono = 80;
            }
        }

        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}