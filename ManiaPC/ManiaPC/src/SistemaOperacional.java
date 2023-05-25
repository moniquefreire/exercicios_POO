public class SistemaOperacional {
    String nome;
    int tipo;

    // Constructors
    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Methods
    void exibeInformacoes() {
        System.out.println("O sistema operacional é: " + nome);
        System.out.println("O seu tipo é: " + tipo + " bits");
    }

}

