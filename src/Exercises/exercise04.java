package Exercises;

import java.util.Scanner;

// Exercício 04
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class exercise04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int funcionario;
    double horasTrabalhadas, valorPagoPorHora = 50, salarioTotal;

    System.out.println("Valor pago por hora: R$50,00");

    System.out.println("Digite o número do funcionário: ");
    funcionario = sc.nextInt();

    System.out.println("Digite o número de horas trabalhadas: ");
    horasTrabalhadas = sc.nextDouble();

    salarioTotal = valorPagoPorHora * horasTrabalhadas;

    System.out.printf("O funcionário número " + funcionario + ", irá receber por " + horasTrabalhadas + " horas trabalhadas, a quantia de R$: %.2f%n", salarioTotal);

    sc.close();
  }
}
