public class Main {
    
    public static void main(String[] args) {
        Singleton escola = Singleton.getInstance("Lobato");
        Singleton escola2 = Singleton.getInstance("Everton");

        System.out.println(escola.Alunos);
        System.out.println(escola2.Alunos);

        escola.addAluno("Diego");
        escola2.addAluno("Pedro");

        System.out.println(escola.Alunos);
        System.out.println(escola2.Alunos);
    }
}
