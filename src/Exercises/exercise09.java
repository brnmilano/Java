package Exercises;

import java.util.Scanner;

// Exercício 09
// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são
// Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.

public class exercise09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt(), y = sc.nextInt();

    if (x % y == 0 || y % x == 0) {
      System.out.println("São múltiplos");
    } else {
      System.out.println("Não são múltiplos");
    }

    sc.close();
  }
}
