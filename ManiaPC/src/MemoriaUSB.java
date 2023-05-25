public class MemoriaUSB {
    String nome;
    int capacidade;

    public MemoriaUSB (String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Methods
    void exibeInformacoes() {
        System.out.println("Acompanha também: ");
        System.out.print(nome);
        System.out.println(" e sua capacidade é: " + capacidade + " GB");
    }
}

