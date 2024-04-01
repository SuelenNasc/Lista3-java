import java.util.Scanner;

class Professor {
    private int nivel;
    private double valorHoraAula;

    public Professor(int nivel, double valorHoraAula) {
        this.nivel = nivel;
        this.valorHoraAula = valorHoraAula;
    }

    public double calcularSalario(int horasAula) {
        return horasAula * valorHoraAula;
    }
}