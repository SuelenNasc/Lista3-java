import java.util.Scanner;

class Produto {
    private double precoCusto;
    private double precoVenda;

    public Produto(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String verificarLucroPrejuizoEmpate() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}