import java.util.List;

public class LocadoraController {
    private LocadoraModel model;
    private LocadoraView view;

    public LocadoraController(LocadoraModel model, LocadoraView view) {
        this.model = model;
        this.view = view;
    }

    public void addFilme(String title, String genero) {
        model.addFilme(title, genero);
    }

    public void removeFilme(String title) {
        model.removeFilme(title);
    }

    public void searchFilmesByTitle(String keyword) {
        List<Filme> filmes = model.getAllFilmes();
        SearchStrategy strategy = new SearchByTitleStrategy();
        List<Filme> results = strategy.search(filmes, keyword);
        view.displayFilmes(results);
    }

    public void searchFilmesByGenero(String keyword) {
        List<Filme> filmes = model.getAllFilmes();
        SearchStrategy strategy = new SearchByGeneroStrategy();
        List<Filme> results = strategy.search(filmes, keyword);
        view.displayFilmes(results);
    }
}

