import java.util.Scanner;

class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public double calcularSalarioFinal() {
        double comissao = totalVendas * 0.15;
        return salarioFixo + comissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
