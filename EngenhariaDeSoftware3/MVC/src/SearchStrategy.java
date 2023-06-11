// Classe Strategy

import java.util.List;

public interface SearchStrategy {
    List<Filme> search(List<Filme> filmes, String keyword);
}

