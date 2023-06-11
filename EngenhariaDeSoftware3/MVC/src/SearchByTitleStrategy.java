import java.util.ArrayList;
import java.util.List;

public class SearchByTitleStrategy implements SearchStrategy {
    @Override
    public List<Filme> search(List<Filme> filmes, String keyword) {
        List<Filme> results = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(filme);
            }
        }
        return results;
    }
}


