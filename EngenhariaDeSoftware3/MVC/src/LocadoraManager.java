// Classe Singleton
public class LocadoraManager {
    private static LocadoraManager instance;
    private int LocadoraId;

    private LocadoraManager() {
        // Construtor privado para evitar instanciação direta
        LocadoraId = 1; // Defina o ID aqui
    }

    public static LocadoraManager getInstance() {
        if (instance == null) {
            instance = new LocadoraManager();
        }
        return instance;
    }

    public int getLibraryId() {
        return LocadoraId;
    }

}

