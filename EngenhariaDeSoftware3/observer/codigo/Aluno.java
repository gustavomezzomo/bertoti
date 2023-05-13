public class Aluno implements Observer{
    private String name;

    public Aluno(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " foi notificado: " + message);
    }
    
}
