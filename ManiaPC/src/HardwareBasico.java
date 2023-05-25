import java.util.Objects;

public class HardwareBasico {
    String nome;
    float capacidade;

    // Constructors
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Methods
    void exibeInformacoes() {
        System.out.print(nome);
        String[] nomesSeparados = nome.split(" ");
        if (Objects.equals(nomesSeparados[1], "Core")) {
            System.out.println(" e sua capacidade é: " + capacidade + " MHz");
        } else {
            System.out.println(" e sua capacidade é: " + capacidade + " Gb");
        }
    }

}

