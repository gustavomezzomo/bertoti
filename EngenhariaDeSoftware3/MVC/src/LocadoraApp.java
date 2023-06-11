public class LocadoraApp {
    public static void main(String[] args) {
        // Criação da instância do LocadoraFacade
        LocadoraFacade locadoraFacade = new LocadoraFacade();

        // Adicionando alguns filmes à locadora
        locadoraFacade.addFilme("Filme 1", "Genero 1");
        locadoraFacade.addFilme("Filme 2", "Genero 2");
        locadoraFacade.addFilme("Filme 3", "Genero 1");
        locadoraFacade.addFilme("Filme 4", "Genero 3");

        // Realizando uma busca por título
        System.out.println("Busca por título:");
        locadoraFacade.searchFilmesByTitle("Filme");

        // Realizando uma busca por autor
        System.out.println("Busca por genro:");
        locadoraFacade.searchFilmesBygenero("Genero 1");

        // Removendo um filme da locadora
        locadoraFacade.removeFilme("Filme 2");

        // Realizando uma nova busca por título
        System.out.println("Busca por título após remoção:");
        locadoraFacade.searchFilmesByTitle("Filme 2");
    }
}
