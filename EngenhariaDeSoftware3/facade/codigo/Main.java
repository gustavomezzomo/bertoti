
public class Main {
    public static void main(String[] args) {

        String[] filmes = { "Percy Jackson", "Mario", "Sonic" };
        int[] codigos = { 100, 200, 300, 400 };

        Ferramenta filme = new Filme();
        Facade facade = new Facade(filme);

        for (int i = 0; i <= filmes.length; i++) {
            facade.adicionarFilme(filmes[i], codigos[i]);
            System.out.println("------------------------------------------------------------------------");
        }

    }
}