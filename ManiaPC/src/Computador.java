public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoria;
    SistemaOperacional sistemaop;
    HardwareBasico[] hwbasico = new HardwareBasico[100];

    // Constructors
    public Computador(String marca, float preco, SistemaOperacional sistemaop, HardwareBasico[] hwbasico) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaop = sistemaop;
        this.hwbasico = hwbasico;
    }

    void mostraPCConfigs() {
        System.out.println("A marca do computador é: " + marca);
        System.out.println("O preco do computador é: " + preco + " reais");
        System.out.println("");
        System.out.println("O hardware básico é:");
        for(int i = 0; i < hwbasico.length; i++){
            if(hwbasico[i] == null) {
                break;
            }
            hwbasico[i].exibeInformacoes();
        }
        System.out.println("");
        sistemaop.exibeInformacoes();
        System.out.println("");
        memoria.exibeInformacoes();
        System.out.println("--------------------------------------------------------");

    }

    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }

}
