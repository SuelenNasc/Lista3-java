import java.util.Scanner;

class Seguradora {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Seguradora(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public void determinarCategoria() {
        String categoria = "Não se enquadra";

        if (idade >= 17 && idade <= 70) {
            if (idade >= 17 && idade <= 20) {
                switch (grupoRisco) {
                    case "Baixo":
                        categoria = "1";
                        break;
                    case "Médio":
                        categoria = "2";
                        break;
                    case "Alto":
                        categoria = "3";
                        break;
                }
            } else if (idade >= 21 && idade <= 24) {
                switch (grupoRisco) {
                    case "Baixo":
                        categoria = "2";
                        break;
                    case "Médio":
                        categoria = "3";
                        break;
                    case "Alto":
                        categoria = "4";
                        break;
                }
            } else if (idade >= 25 && idade <= 34) {
                switch (grupoRisco) {
                    case "Baixo":
                        categoria = "3";
                        break;
                    case "Médio":
                        categoria = "4";
                        break;
                    case "Alto":
                        categoria = "5";
                        break;
                }
            } else if (idade >= 35 && idade <= 64) {
                switch (grupoRisco) {
                    case "Baixo":
                        categoria = "4";
                        break;
                    case "Médio":
                        categoria = "5";
                        break;
                    case "Alto":
                        categoria = "6";
                        break;
                }
            } else if (idade >= 65 && idade <= 70) {
                switch (grupoRisco) {
                    case "Baixo":
                        categoria = "7";
                        break;
                    case "Médio":
                        categoria = "8";
                        break;
                    case "Alto":
                        categoria = "9";
                        break;
                }
            }
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria de seguro: " + categoria);
    }
}