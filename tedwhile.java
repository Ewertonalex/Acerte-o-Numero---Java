package exercicio;

import java.util.Scanner;
import java.util.Random;

public class tedwhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt(10);
        /*System.out.println(numeroAleatorio);*/

        String nome;
        int numeroEntrada;
        int tentativas = 1;

        System.out.println("Qual o seu nome? " );
        nome = n.next();
        System.out.println(nome + ", digite um número de 0 a 10: ");

        numeroEntrada = scan.nextInt();


        while (numeroEntrada != numeroAleatorio) {


            if (numeroEntrada >  numeroAleatorio) {

                System.out.println("Errou. Tente um número menor.");
                numeroEntrada = scan.nextInt();
                tentativas++;
            }


            else if (numeroEntrada < numeroAleatorio) {
                System.out.println("Errou. Tente um número maior.");
                numeroEntrada = scan.nextInt();
                tentativas++;
            }

        }

        if (numeroEntrada ==  numeroAleatorio) {
            System.out.println("Parabéns " + nome + ", você acertou!\nO número era o " + numeroAleatorio + ".\nVocê preciso de " + tentativas + " tentativas para acertar!.");

        }



    }



}