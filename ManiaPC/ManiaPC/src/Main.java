import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Criando um cliente
        Cliente cliente1 = new Cliente("Cris", 21144566);

        // Criando sistemas operacionais da promocao
        SistemaOperacional[] sistemaop = new SistemaOperacional[3];
        sistemaop[0] = new SistemaOperacional("Linux Ubuntu", 32);
        sistemaop[1] = new SistemaOperacional("Windows 8", 64);
        sistemaop[2] = new SistemaOperacional("Windows 10", 64);

        // Criando hardware basico da positivo
        HardwareBasico[] hwBasicoPositivo = new HardwareBasico[3];
        hwBasicoPositivo[0] = new HardwareBasico("Processador Core i3", 2200);
        hwBasicoPositivo[1] = new HardwareBasico("Memória RAM", 8);
        hwBasicoPositivo[2] = new HardwareBasico("HD interno", 500);
        // Criando hardware basico da acer
        HardwareBasico[] hwBasicoAcer = new HardwareBasico[3];
        hwBasicoAcer[0] = new HardwareBasico("Processador Core i5", 3370);
        hwBasicoAcer[1] = new HardwareBasico("Memória RAM", 8);
        hwBasicoAcer[2] = new HardwareBasico("HD interno", 1000);
        // Criando hardware basico da vaio
        HardwareBasico[] hwBasicoVaio = new HardwareBasico[3];
        hwBasicoVaio[0] = new HardwareBasico("Processador Core i7", 4500);
        hwBasicoVaio[1] = new HardwareBasico("Memória RAM", 32);
        hwBasicoVaio[2] = new HardwareBasico("HD interno", 2000);

        // Criando as memórias usb
        MemoriaUSB[] memoria = new MemoriaUSB[3];
        memoria[0] = new MemoriaUSB("Pen drive", 16);
        memoria[1] = new MemoriaUSB("Pen drive", 32);
        memoria[2] = new MemoriaUSB("HD externo", 1000);

        // Criando os computadores
        Computador computador1 = new Computador("Positivo", 2300, sistemaop[0], hwBasicoPositivo);
        Computador computador2 = new Computador("Acer", 5800, sistemaop[1], hwBasicoAcer);
        Computador computador3 = new Computador("Vaio", 1800, sistemaop[2], hwBasicoVaio);

        computador1.addMemoriaUSB(memoria[0]);
        computador2.addMemoriaUSB(memoria[1]);
        computador3.addMemoriaUSB(memoria[2]);

        System.out.println("\nBoa tarde/dia/noite! Temos as seguintes promoções\n");
        System.out.println("Promoção 1:");
        computador1.mostraPCConfigs();
        System.out.println("Promoção 2:");
        computador2.mostraPCConfigs();
        System.out.println("Promoção 3:");
        computador3.mostraPCConfigs();

        System.out.println("Digite 1 para promoção 1");
        System.out.println("Digite 2 para promoção 2");
        System.out.println("Digite 3 para promoção 3");
        System.out.println("Digite 4 para encerrar a compra");

        System.out.println("Entre com a sua compra:");
        int opcaoDeCompra = entrada.nextInt();

        while (true) {
            Boolean opcaoValida = true;

            if (opcaoDeCompra == 1) {
                cliente1.addCompra(computador1);
            } else if (opcaoDeCompra == 2) {
                cliente1.addCompra(computador2);
            } else if (opcaoDeCompra == 3) {
                cliente1.addCompra(computador3);
            } else if (opcaoDeCompra == 4) {
                break;
            } else {
                opcaoValida = false;
            }

            if (opcaoValida) {
                System.out.println("Deseja comprar algo mais? As promoções ainda são válidas");
            } else {
                System.out.println("Entre com uma opção válida");
                System.out.println("Digite 1 para promoção 1");
                System.out.println("Digite 2 para promoção 2");
                System.out.println("Digite 3 para promoção 3");
                System.out.println("Digite 4 para encerrar a compra");
            }
            opcaoDeCompra = entrada.nextInt();
            opcaoValida = true;
        }
        System.out.println("\nObrigado por comprar com a gente querido " + cliente1.nome + "!!!\nSuas compras são:");
        cliente1.pegarInformacoesDaCompra();
        System.out.println("\nO total da compra é: " + cliente1.calculaTotalCompra());

    }
}