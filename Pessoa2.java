import java.util.Scanner;

class Pessoa2 {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public Pessoa2(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApta() {
        return (idade >= 18 && saude);
    }

    public char getSexo() {
        return sexo;
    }
}
