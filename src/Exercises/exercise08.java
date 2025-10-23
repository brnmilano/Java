package Exercises;

import java.util.Scanner;

// Exercício 08
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercise08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x;

    System.out.println("Digite um número: ");
    x = sc.nextInt();

    if (x % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    }

    sc.close();
  }
}
