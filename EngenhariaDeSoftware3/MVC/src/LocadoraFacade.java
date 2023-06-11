// Classe Facade
public class LocadoraFacade {
    private LocadoraController controller;
    private LocadoraModel model;
    private LocadoraView view;

    public LocadoraFacade() {
        model = new LocadoraModel();
        view = new LocadoraView(model);
        controller = new LocadoraController(model, view);
        model.addObserver(view);
    }

    public void addFilme(String title, String genero) {
        controller.addFilme(title, genero);
    }

    public void removeFilme(String title) {
        controller.removeFilme(title);
    }

    public void searchFilmesByTitle(String keyword) {
        controller.searchFilmesByTitle(keyword);
    }

    public void searchFilmesByGenero(String keyword) {
        controller.searchFilmesByGenero(keyword);
    }
}

