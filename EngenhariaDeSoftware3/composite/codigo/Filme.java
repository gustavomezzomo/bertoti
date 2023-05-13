public class Filme implements Locadora{
    String nome;

    @Override
    public void alugar() {
        System.out.println("O filme " + nome + " Foi alugado!");
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    
}
