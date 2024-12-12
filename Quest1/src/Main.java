public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("Alex", 21);

        System.out.println("Dados do Triatleta");
        triatleta.exibirDados();

        System.out.println("\nAtividades");
        triatleta.nadar();
        triatleta.correr();
        triatleta.pedalar();
        triatleta.competir();
    }
}