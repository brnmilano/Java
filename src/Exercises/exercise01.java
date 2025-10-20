package Exercises;

import java.util.Scanner;

public class exercise01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero1, numero2, soma1e2;

    numero1 = sc.nextInt();
    numero2 = sc.nextInt();

    soma1e2 = numero1 + numero2;

    System.out.println("Soma nos números: " + soma1e2);

    sc.close();
  }
}
