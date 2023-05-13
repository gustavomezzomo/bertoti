public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();

        Professor professor1 = new Professor("Bertoti");
        Professor professor2 = new Professor("Arley");

        Aluno aluno1 = new Aluno("Gustavo");
        Aluno aluno2 = new Aluno("Guilherme");

        escola.addObserver(professor1);
        escola.addObserver(professor2);
        escola.addObserver(aluno1);
        escola.addObserver(aluno2);

    }
}
