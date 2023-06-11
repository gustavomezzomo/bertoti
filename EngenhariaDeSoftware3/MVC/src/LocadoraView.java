import java.util.List;

public class LocadoraView implements Observer {
    private LocadoraModel model;

    public LocadoraView(LocadoraModel model) {
        this.model = model;
    }

    public void displayBooks(List<Filme> filmes) {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme encontrado.");
        } else {
            System.out.println("filmes encontrados:");
            for (Filme filme : filmes) {
                System.out.println("Título: " + filme.getTitle());
                System.out.println("Genero: " + filme.getGenero());
                System.out.println("-----------------------");
            }
        }
    }

    @Override
    public void update() {
        List<Filme> filmes = model.getAllFilmes();
        displayFilmes(filmes);
    }
}

