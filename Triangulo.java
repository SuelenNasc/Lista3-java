import java.util.Scanner;

class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean eTriangulo() {
        return (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1);
    }

    public String tipoTriangulo() {
        if (!eTriangulo()) {
            return "Os valores fornecidos não formam um triângulo válido.";
        }

        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triângulo Isóscele";
        } else {
            return "Triângulo Escaleno";
        }
    }
}
