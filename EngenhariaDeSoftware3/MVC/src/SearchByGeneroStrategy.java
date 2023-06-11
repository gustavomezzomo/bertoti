import java.util.ArrayList;
import java.util.List;

public class SearchByGeneroStrategy implements SearchStrategy {
    @Override
    public List<Filme> search(List<Filme> filmes, String keyword) {
        List<Filme> results = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.getGenero().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(filme);
            }
        }
        return results;
    }
}

