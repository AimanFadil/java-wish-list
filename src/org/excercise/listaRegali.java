package org.excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class listaRegali {
    public static void main(String[] args) {


        List<String> regali = new ArrayList<>();


        File filepath = new File("./src/file/wish.txt");

            try{
                Scanner scanner = new Scanner(filepath);
                while(scanner.hasNextLine()){
                    String line= scanner.nextLine();
                    regali.add(line);

                }
                scanner.close();
            }catch (Exception e){
            }




        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il regalo nella wishlist: ");
            String nome = scanner.nextLine();

            System.out.println("Numeri di regali: " + " " + regali.size());

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

        try  {
            FileWriter svuota = new FileWriter(filepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String regalo : regali){


            try {
                FileWriter fileWriter = new FileWriter(filepath, true);
                fileWriter.write(regalo);
                fileWriter.write(System.lineSeparator());
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        scanner.close();
    }
}
