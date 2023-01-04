import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----BEM VINDO A CALCULADORA JAVA-----");
        for (;;) {
            System.out.println("- DIGITE 1 PARA SOMAR (+)");
            System.out.println("- DIGITE 2 PARA SUBITRAIR (-)");
            System.out.println("- DIGITE 3 PARA MUTIPLICAR (X)");
            System.out.println("- DIGITE 4 PARA DIVIDIR (/)");
            System.out.print("DIGITE O NUMERO ESCOLHIDO: ");
            int opcaoMenu = scanner.nextInt();

            if (opcaoMenu == 1) {

                System.out.println("-----VOCE ESCOLHEU SOMA---");
                System.out.print("DIGITE O PRIMEIRO NUMERO: ");
                int numSoma1 = scanner.nextInt();
                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                int numSoma2 = scanner.nextInt();
                int soma = numSoma1 + numSoma2;
                System.out.println("RESULTADO DA SOMA: " + soma);

            } else if (opcaoMenu == 2) {

                System.out.println("-----VOCE ESCOLHEU SUBTRAÇÃO---");
                System.out.print("DIGITE O PRIMEIRO NUMERO: ");
                int numSubtracao1 = scanner.nextInt();
                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                int numSubtracao2 = scanner.nextInt();
                int subtracao = numSubtracao1 - numSubtracao2;
                System.out.println("RESULTADO DA SUBTRAÇÃO: " + subtracao);

            } else if (opcaoMenu == 3) {

                System.out.println("-----VOCE ESCOLHEU MULTIPLICAÇÃO---");
                System.out.print("DIGITE O PRIMEIRO NUMERO: ");
                int numMultiplicacao1 = scanner.nextInt();
                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                int numMultiplicacao2 = scanner.nextInt();
                int multiplicacao = numMultiplicacao1 * numMultiplicacao2;
                System.out.println("RESULTADO DA MULTIPLICAÇÃO: " + multiplicacao);

            } else if (opcaoMenu == 4) {

                System.out.println("-----VOCE ESCOLHEU DIVISÃO---");
                System.out.print("DIGITE O PRIMEIRO NUMERO: ");
                int numDivesao1 = scanner.nextInt();
                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                int numDivesao2 = scanner.nextInt();
                int divesao = numDivesao1 / numDivesao2;
                System.out.println("RESULTADO DA DIVISÃO: " + divesao);

            } else {
                System.out.println("VOCÊ ESCOLHEU UMA OPÇÃO INVALIDA");
            }
        }
    }
}
