package org.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaRegali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> regali = new ArrayList<>();

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il regalo nella wishlist: ");
            String nome = scanner.nextLine();

            System.out.println("Numeri di regali: " + " " + (regali.size()+1));

            regali.add(nome);

            System.out.println("Vuoi aggiungere un altro regalo? y(SI)/n(NO) ");
            String risposta = scanner.nextLine();


            while (!risposta.equalsIgnoreCase("y") && !risposta.equalsIgnoreCase("n")) {
                System.out.println("Scelta invalida. Inserisci 'y' per continuare o 'n' per terminare: ");
                risposta = scanner.nextLine();
            }

            continua = risposta.equalsIgnoreCase("y");
        }

        System.out.println("La tua lista regali è:");
        for (String regalo : regali) {
            System.out.println(regalo);
        }
    }
}
