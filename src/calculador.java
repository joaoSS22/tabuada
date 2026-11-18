import java.util.Scanner;


public class calculador {
    public static void main(String[] args) {

        tabuada();

    }
public static void tabuada() {
    Scanner scaner = new Scanner(System.in);
     String frase;
     int looping;
     int numero;
     int numeroControle;
     int multiplicador;


    do {
            System.out.println("Por favor digite um número para calcular a tabuada");
            numero = scaner.nextInt();
            multiplicador = 1;
            while (multiplicador <= 10){

        numeroControle = numero * multiplicador;
                System.out.println(numeroControle);
                multiplicador++;
            }
            System.out.println("Aperte 1 para continuar o looping \nAperte 2 para sair");
            looping = scaner.nextInt();

            if (looping == 1){
                System.out.println("Por favor digite uma palavra ou frase");
                scaner.nextLine();;
                frase = scaner.nextLine();;
                System.out.println(frase);

            }else {
                System.out.println( "Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            }
        }while (looping == 1);;
    }

}
