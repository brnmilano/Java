import java.util.Scanner;

// sc.nextLine(); - lê um texto até a quebra de linha, considerando espaço.

public class dataProcessing3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x;
    String d1, d2, d3;

    x = sc.nextInt();
    // O sc.nextLine() abaixo, serve para limpar o buffer de leitura, ou seja, consumir a quebra de linha que fica pendente no sc.nextInt() de cima.
    sc.nextLine();
    d1 = sc.nextLine();
    d2 = sc.nextLine();
    d3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(x);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);

    sc.close();
  }
}
