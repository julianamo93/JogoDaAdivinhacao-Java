import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1; // Gera um número aleatório de 1 a 100
        int tent = 0;
        int numDig;

        System.out.println("---------- Jogo da Adivinhação! ----------");
        System.out.println("Você pode digitar qualquer número...");
        System.out.println("E mais uma coisinha: você tem 5 tentativas!");

        while (tent < 5) {
            System.out.println("Digite um número: ");
            numDig = ler.nextInt();
            tent++;

            if (numDig == num) {
                System.out.println("Parabéns, você acertou o número em " + tent + " tentativas!");
                break; // Sai do loop se o número for adivinhado
            } else if (numDig > num) {
                System.out.println("Ops! Tente novamente! O número gerado é maior que o número digitado.");
            } else {
                System.out.println("Ops! Tente novamente! O número gerado é menor que o número digitado.");
            }
        }

        if (tent == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + num);
        }
    }
}