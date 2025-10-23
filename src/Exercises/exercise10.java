package Exercises;

import java.util.Scanner;

// Exercício 10
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class exercise10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, f;
    double duracao;

    System.out.println("Digite a hora inicial do jogo: ");
    i = sc.nextInt();

    System.out.println("Digite a hora final do jogo: ");
    f = sc.nextInt();

    if (i < f) {
      duracao = i - f;
    } else {
      duracao = i + f - 24;
    }

    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
  }
}
