package model;

public class FilmePremiumProxy implements Conteudo {

    private FilmePremium filme;

    public FilmePremiumProxy() {
        this.filme = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario) {

        if (usuario == null) {
            throw new IllegalArgumentException("Usuário inválido.");
        }

        if ("PREMIUM".equalsIgnoreCase(usuario.getPlano())) {
            System.out.println("Acesso liberado para " + usuario.getNome());
            filme.assistir(usuario);
        } else {
            System.out.println("Acesso negado para " + usuario.getNome()
                    + ". Conteúdo disponível apenas para usuários PREMIUM.");
        }
    }
}