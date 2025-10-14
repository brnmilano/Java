public class dataProcessing {
  public static void main(String[] args) {
    // Multiplicação simples
    int x, y;
    double z;

    x = 5;
    y = 2 * x;
    z = y * 2;


    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    // -----------------------------------------------------------------------------------------------------------------
    // Calcular área de um trapézio:

    double b, B, h, area;

    b = 6.0;
    B = 8.0;
    h = 5.0;

    area = (b + B) / 2.0 * h;

    System.out.println(area);

    // -----------------------------------------------------------------------------------------------------------------
    // Casting

    int d, e;

    double resultado;

    d = 5;
    e = 2;

    // Declarar o (double) faz o Casting, ou seja, a conversar explícita dos valores.
    resultado = (double) d / e;

    System.out.println(resultado);


    // Aqui estou informando ao compilador que não importa as casas decimais que existem na variável ab.
    double ab;
    int cd;

    ab = 5.0;
    cd = (int) ab;

    System.out.println(cd);
  }
}
