import java.util.Scanner;

class Estudante {
    private String nome;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExame;

    public Estudante(String nome, int numeroMatricula, double notaLaboratorio, double notaAvaliacao, double notaExame) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExame = notaExame;
    }

    public double calcularNotaFinal() {
        double pesoLaboratorio = 2;
        double pesoAvaliacao = 3;
        double pesoExame = 5;

        return (notaLaboratorio * pesoLaboratorio + notaAvaliacao * pesoAvaliacao + notaExame * pesoExame) / (pesoLaboratorio + pesoAvaliacao + pesoExame);
    }

    public String determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
}