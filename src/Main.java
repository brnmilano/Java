import java.util.Locale;

// print -> mostra o resultado no terminal
// println -> mostra o resultado no terminal quebrando uma linha
// printf -> mostra o resultado formatado no terminal

// Para especificar casas decimais ao mostrar um resultado no terminal: "%.2f%n"
// %.2f -> indica que o valor exibido será delimitado a duas casas decimais
// %n -> indica uma quebra de linha no terminal ao exibir um valor formatado
// Inicialmente, a formatação coloca uma vírgula como separador, pois pega o separador de decimais conforme a linguagem do OS
// Para alterar e adicionar um ponto a formatação, é necessário utilizar o Locale.setDefault(Locale.US);

public class Main {
    public static void main(String[] args) {
        String alfabeto = "abc...";

        int minhaIdade = 29;
        double minhaAltura = 1.76;
        double numeroNaoFormatado = 10.35784;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Exibindo valores de variáveis no terminal
        System.out.println(alfabeto);
        System.out.println(minhaIdade);
        System.out.println(minhaAltura);

        // Exibindo valores formatados com um número X de casas decimais:
        System.out.printf("%.2f%n", numeroNaoFormatado);
        System.out.printf("%.4f%n", numeroNaoFormatado);

        // Adicionando o ponto a formatação:
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", numeroNaoFormatado);

        // Concatenar vários elementos em um mesmo comando de escrita:
        System.out.println("Resultado = " + num2 + " metros.");

        // Concatenar vários elementos em um mesmo comando com o printf:
        System.out.printf("Resultado = %.2f metros%n", numeroNaoFormatado);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // %f = ponto flutuante (renda)
        // %d = inteiro (idade)
        // %s = texto (nome)
        // %n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n%n", nome, idade, renda);

        // -------------------------------------------------------------------------------------------------------------
        // Exercício de fixação:

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
