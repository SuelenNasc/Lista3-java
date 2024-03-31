public class VerificadorIdade {
    public static String verificarMaioridade(int idade) {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
