package app;

import model.*;

public class Main {

    public static void main(String[] args) {

        Conteudo conteudo = new FilmePremiumProxy();

        // cenario 1 — premium
        Usuario u1 = new Usuario("Carlos", "PREMIUM");
        conteudo.assistir(u1);

        // cenario 2 — basico
        Usuario u2 = new Usuario("Ana", "BASICO");
        conteudo.assistir(u2);

        // cenario 3 — premium
        Usuario u3 = new Usuario("Marina", "PREMIUM");
        conteudo.assistir(u3);

        // cenario 4 — basico
        Usuario u4 = new Usuario("Pedro", "BASICO");
        conteudo.assistir(u4);

        // cenario — usuario invalido
        try {
            conteudo.assistir(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}