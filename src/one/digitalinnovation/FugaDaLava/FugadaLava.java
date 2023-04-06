package one.digitalinnovation.FugaDaLava;

import java.util.Random;
import java.util.Scanner;

//import one.digitalinnovation.gof.strategy.*;

/**
 * FugadaIlha
 */
public class FugadaLava {

    public static void main(String[] args) {

        String opcao;
        int resultadoMovimento, posicaoRobo = 4, posicaoChegada = 15, posicaoLava = 0;
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Scanner leitor = new Scanner(System.in);
        Random rand = new Random();

        Robo robo = new Robo();
        robo.setStatus(1); // liga o robo

        System.out.println("Controle o robô para que ele alcance a jangada enquanto foge da lava!\n");
        while ((posicaoRobo < posicaoChegada) && (posicaoLava < posicaoRobo)) {
            desenha(posicaoLava, posicaoRobo, posicaoChegada);
            if (robo.getStatus() == 1) { // se o robo está funcionando normalmente
                System.out.println("\nEscolha o tipo do movimento do robô");
                System.out.println("D - Defensivo | N - Normal | A - Agressivo");
                opcao = leitor.next().toUpperCase();
                switch (opcao) {
                    case "D":
                        robo.setComportamento(defensivo);
                        break;
                    case "N":
                        robo.setComportamento(normal);
                        break;
                    case "A":
                        robo.setComportamento(agressivo);
                        break;
                }
                resultadoMovimento = robo.mover();

                if (resultadoMovimento < 0) {
                    robo.setStatus(0); // preso, perde um turno
                    posicaoRobo += resultadoMovimento * -1; // movimento foi interrompido
                    System.out.println("O robo está preso, perca um turno");
                } else {
                    posicaoRobo += resultadoMovimento;

                }
            } else {
                robo.setStatus(1);
            }
            posicaoLava += rand.nextInt(2) + 1;
            // System.out.println("posição robo: " + posicaoRobo );
            // System.out.println("posição lava: " + posicaoLava );
        }

        if (posicaoLava >= posicaoRobo) {
            System.out.println("\nA lava alcançou o robô :(");
        } else {
            System.out.println("\nO robô conseguiu escapar!");
        }

        leitor.close();
    }

    private static void desenha(int posicaoLava, int posicaoRobo, int posicaoChegada) {

        System.out.println("");
        System.out.print("=".repeat(posicaoLava) + ">");
        System.out.print("  ".repeat(posicaoRobo - posicaoLava) + "  O");
        System.out.println("  ".repeat(posicaoChegada - posicaoRobo)+ "  =|=|=");

        System.out.print("=".repeat(posicaoLava + 2) + ">");
        System.out.print("  ".repeat(posicaoRobo - posicaoLava) + "|-");
        System.out.println("  ".repeat(posicaoChegada - posicaoRobo)+ " =|=|=");

        System.out.print("=".repeat(posicaoLava + 3) + '>');
        System.out.print("  ".repeat(posicaoRobo - posicaoLava - 1) + "oooo");
        System.out.println("  ".repeat(posicaoChegada - posicaoRobo)+ "=|=|=");
    }

}