import java.util.Scanner;

class CalculoNota {
    public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacao, double notaExame) {
        double pesoLaboratorio = 2;
        double pesoAvaliacao = 3;
        double pesoExame = 5;

        return (notaLaboratorio * pesoLaboratorio + notaAvaliacao * pesoAvaliacao + notaExame * pesoExame) / (pesoLaboratorio + pesoAvaliacao + pesoExame);
    }
}