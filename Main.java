import java.util.Scanner;

public class Aviao {
    // Atributos
    private String modelo;
    private int capacidadePassageiros;
    private int passageirosAtuais;

    // Construtor
    public Aviao(String modelo, int capacidadePassageiros) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.passageirosAtuais = 0;
    }

    // Método para embarcar passageiros
    public void embarcarPassageiros(int quantidade) {
        if (passageirosAtuais + quantidade <= capacidadePassageiros) {
            passageirosAtuais += quantidade;
            System.out.println(quantidade + " passageiros embarcados com sucesso.");
        } else {
            System.out.println("Capacidade máxima de passageiros excedida.");
        }
    }

    // Método para desembarcar passageiros
    public void desembarcarPassageiros(int quantidade) {
        if (quantidade <= passageirosAtuais) {
            passageirosAtuais -= quantidade;
            System.out.println(quantidade + " passageiros desembarcados com sucesso.");
        } else {
            System.out.println("Não há passageiros suficientes para desembarcar.");
        }
    }

    // Método para exibir informações do avião
    public void informacoesAviao() {
        System.out.println("Modelo do avião: " + modelo);
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Passageiros atuais: " + passageirosAtuais);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do avião
        Aviao aviao = new Aviao("Boeing 747", 400);

        // Menu de interação com o usuário
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Embarcar passageiros");
            System.out.println("2. Desembarcar passageiros");
            System.out.println("3. Ver informações do avião");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantos passageiros deseja embarcar?");
                    int embarque = scanner.nextInt();
                    aviao.embarcarPassageiros(embarque);
                    break;
                case 2:
                    System.out.println("Quantos passageiros deseja desembarcar?");
                    int desembarque = scanner.nextInt();
                    aviao.desembarcarPassageiros(desembarque);
                    break;
                case 3:
                    aviao.informacoesAviao();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
