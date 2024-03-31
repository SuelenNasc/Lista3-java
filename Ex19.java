import java.util.Scanner;

public class Ex19 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o segundo lado do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o terceiro lado do triângulo:");
        int lado3 = scanner.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipo = triangulo.tipoTriangulo();

        System.out.println(tipo);

        scanner.close();
    }
}