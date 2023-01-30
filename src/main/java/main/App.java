package main;

import java.util.Scanner;

/**
 * Olio-ohjelmointi viikko 2
 * Veikko Vanninen
 * 
 */
public class App {
    public static void main( String[] args ) {
        Scanner selection = new Scanner(System.in);

        Hedgehog hedgehog = new Hedgehog();

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(selection.hasNext()) {
                int i = 0;
                String stringInput = selection.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String say = selection.nextLine();
                        if (say.isEmpty()) {
                            hedgehog.giveSay();
                            break;
                        } else {
                            hedgehog.getSay(say);
                            hedgehog.speak();
                            break;
                        }   
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = selection.nextLine();
                        hedgehog.getName(name);
                        System.out.println("Anna siilin ikä:");
                        String ageString = selection.nextLine();
                        int age = Integer.parseInt(ageString);
                        hedgehog.getAge(age);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String lapString = selection.nextLine();
                        int lap = Integer.parseInt(lapString);
                        hedgehog.run(lap);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }

        }

    }
}
