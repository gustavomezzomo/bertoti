public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Matrix");
        Filme filme1 = new filme();
        filme1.setNome("Harry Potter");
        Filme filme2 = new Filme();
        filme2.setNome("Os 3 mosqueteiros");
        Filme filme3 = new Filme();
        filme3.setNome("Star Wars");
        Aluga aluga = new Aluga();
        aluga.add(filme);
        aluga.add(filme1);
        aluga.add(filme2);
        aluga.add(filme3);
        aluga.alugar();

    }
}
