import java.util.ArrayList;
import java.util.List;

public class LocadoraModel {
    private List<Filme> filmes;
    private List<Observer> observers;

    public LocadoraModel() {
        filmes = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addFilme(String title, String genero) {
        Filme filme = new Filme(title, genero);
        filmes.add(filme);
        notifyObservers();
    }

    public void removeFilme(String title) {
        Filme filmeToRemove = null;
        for (Filme filme : filmes) {
            if (filme.getTitle().equalsIgnoreCase(title)) {
                filmeToRemove = filme;
                break;
            }
        }
        if (filmeToRemove != null) {
            filmes.remove(filmeToRemove);
            notifyObservers();
        }
    }

    public List<Filme> getAllFilmes() {
        return filmes;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
