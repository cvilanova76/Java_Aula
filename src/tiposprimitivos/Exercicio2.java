package tiposprimitivos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
        System.out.println("Pontos do líder do campeonato: ");
        int pontosLider = scan.nextInt();

        System.out.println("Pontos do lanterna do campeonato: ");
        int pontosLanterna = scan.nextInt();

        int vitoriasNecessarias = (pontosLider - pontosLanterna)/3;

        System.out.println("Você precisa de :" + vitoriasNecessarias + "vitórias para alcalçar ou ultrapassar o líder");
        
        Scanner.close();
    }
}