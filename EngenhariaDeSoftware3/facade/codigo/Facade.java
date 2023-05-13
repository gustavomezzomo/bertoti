public class Facade {
    private Ferramenta Filme;

    public Facade(Ferramenta filme) {
        this.filme = filme;
    }

    public void adicionarFilme(String filme, int codigo) {
        filme.adicionarFilme(filme);
        filme.criarCodigo(filme, codigo);
    }

}
