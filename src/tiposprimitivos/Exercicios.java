package tiposprimitivos;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite o valor do produto: ");
       double valor = scanner.nextDouble();

       System.out.println("Digite o percentual de desconto: ");
        double percentual = scanner.nextDouble();

        double desconto = valor*(percentual/100);

        double valorFinal = valor - desconto;

        System.out.println("O valor final com desconto é: " + valorFinal);

        scanner.close();
    }
}