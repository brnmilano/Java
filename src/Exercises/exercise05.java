package Exercises;

import java.util.Scanner;

// Exercício 05
// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exercise05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int codPeca1, qntPeca1, codPeca2, qntPeca2;
    double valorPeca1 = 15.30, valorPeca2 = 5.20, valorPago;

    System.out.println("Digite o código da primeira peça: ");
    codPeca1 = sc.nextInt();

    System.out.println("Digite a quantidade de peças desejadas: ");
    qntPeca1 = sc.nextInt();

    System.out.println("Digite o código da segunda peça: ");
    codPeca2 = sc.nextInt();

    System.out.println("Digite a quantidade de peças desejadas: ");
    qntPeca2 = sc.nextInt();

    valorPeca1 = valorPeca1 * qntPeca1;
    valorPeca2 = valorPeca2 * qntPeca2;

    valorPago = valorPeca1 + valorPeca2;

    System.out.printf("VALOR A PAGAR: R$: %.2f%n", valorPago);
  }
}
