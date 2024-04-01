import java.util.Scanner;

class ContaLuzCalculadora {
    public static double calcularContaLuz(int tipoCliente, double kWhConsumidos) {
        double valorKWh;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Utilizando valor padrão para residência.");
                valorKWh = 0.602;
        }

        return valorKWh * kWhConsumidos;
    }
}