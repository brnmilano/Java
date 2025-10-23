package Exercises;

import java.util.Scanner;

// Exercício 07
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exercise07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x;

    System.out.println("Digite um número:");
    x = sc.nextInt();

    if (x >= 0) {
      System.out.println("NÃO NEGATIVO");
    } else {
      System.out.println("NEGATIVO");
    }

    sc.close();
  }
}
