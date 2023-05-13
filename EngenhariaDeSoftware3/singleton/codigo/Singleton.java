import java.util.LinkedList;

public class Singleton{
    private static Singleton escola;

    public LinkedList<String> Alunos = new LinkedList<>();

    private Singleton(String value) {
        Alunos.add(value);
    }

    public static Singleton getInstance(String aluno) {
        if (escola == null) {
            escola = new Singleton(aluno);
        }
        return escola;
    }

    public void addAluno(String alunos){
        Alunos.add(alunos);
    }
}