import java.util.LinkedList;

public class Aluga implements Locadora{
    LinkedList<Locadora> locadora = new LinkedList<>();

    @Override
    public void alugar() {
       locadora.forEach(filme -> filme.alugar());
    }
    public void add(Filme filme0){
        Locadora.add(filme0);
    }
} 
