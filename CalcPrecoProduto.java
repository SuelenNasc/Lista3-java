public class CalcPrecoProduto {

    public static double calcularPrecoVenda(double precoCusto, double percentualLucro) {
        
        return precoCusto * (1 + (percentualLucro / 100));
    }
}
