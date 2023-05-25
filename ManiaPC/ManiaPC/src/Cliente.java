public class Cliente {
    String nome;
    long cpf;
    Computador[] minhasCompras = new Computador[100];

    // Constructors
    Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Methods
    float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < minhasCompras.length; i++) {
            if (minhasCompras[i] == null) {
                break;
            }
            total += minhasCompras[i].preco;
        }
        return total;
    }

    void addCompra(Computador computador) {
        for (int i = 0; i < minhasCompras.length; i++) {
            if (minhasCompras[i] == null) {
                minhasCompras[i] = computador;
                return;
            }
        }

    }

    void pegarInformacoesDaCompra() {
        for (int i = 0; i < minhasCompras.length; i++) {
            if (minhasCompras[i] == null) {
                return;
            }
            minhasCompras[i].mostraPCConfigs();
        }
    }
}
