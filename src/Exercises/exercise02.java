package Exercises;

import java.util.Locale;
import java.util.Scanner;

// Exercício 2
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159


public class exercise02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double raio, resultado;

    System.out.println("Digite o raio: ");

    raio = sc.nextDouble();

    resultado = Math.PI * Math.pow(raio, 2);

    System.out.printf("O raio é: %.4f%n", resultado);

    sc.close();
  }
}
