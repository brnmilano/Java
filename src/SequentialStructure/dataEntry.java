package SequentialStructure;

import java.util.Scanner;

// Para fazer a entrada de dados no Java, podemos criar um objeto do tipo "Scanner".
// Nome da variável: sc
// Tipo da variável: Scanner
// Iniciação da variável: new Scanner(System.in)
// Scanner sc = new Scanner(System.in);
// sc.close() interrompe

// Para ler uma string: sc.next();
// Para ler um número inteiro: sc.nextInt();
// Para ler um número com ponto flutuante: sc.nextDouble(); - A leitura é feita com a Localidade do OS
// Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
// Locale.setDefault(Locale.US);
// Para ler um caractere: sc.next().charAt(0);
// Para ler vários dados na mesma linha:
// x = sc.next();
// y = sc.nextInt();
// z = sc.nextDouble();

public class dataEntry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Para ler uma string:
    String x;
    x = sc.next();

    System.out.println("Você digitou: " + x);

    // Para ler um número inteiro:
    int a;
    a = sc.nextInt();

    System.out.println("O número digitado é: " + a);

    // Para ler um número com ponto flutuante:
    double b;
    b = sc.nextDouble();

    System.out.println("O número com ponto flutuante digitado é: " + b);

    // Para ler um caractere
    char c;
    c = sc.next().charAt(0);

    System.out.println("O caractere digitado é: " + c);

    // Ler vários dados na mesma linha
    String d;
    int e;
    double f;

    d = sc.next();
    e = sc.nextInt();
    f = sc.nextDouble();

    System.out.println("Dados digitados: ");
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    sc.close();
  }
}
