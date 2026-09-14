package com.company;

import java.lang.invoke.SerializedLambda;
import java.util.Scanner;

public class Main {
    static float scitaj (float a, int b){
        return a+b;
    }
    static float odcitaj (float a, int b){
        return a-b;
    }
    static float nasobenie (float a, int b){
        return a*b;
    }
    static float delenie (float a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        boolean opakovanie = true;
        Scanner scanner = new Scanner(System.in);
        while(opakovanie){
            System.out.println("##Vitaj v java kalkulačke##");
            System.out.println("Zadaj prve cislo: ");
            float prve = scanner.nextInt();
            System.out.println("Zadaj druhe cislo: ");
            int druhe = scanner.nextInt();
            System.out.println("Zadaj operaciu (1 pre +) (2 pre -) (3 pre *) (4 pre /): ");
            int operacia = scanner.nextInt();
            int i = 1;
            int y = 2;
            int x = 3;
            int z = 4;
            if (operacia == i)
            {
                System.out.println("Vysledok je: ");
                float vysledok_scitaj = scitaj(prve,druhe);
                System.out.println(vysledok_scitaj);


            }
            else if (operacia == y)
            {
                System.out.printf("Vysledok je: ");
                float vysledok_odcitaj = odcitaj(prve,druhe);
                System.out.println(vysledok_odcitaj);
            }
            else if (operacia == x)
            {
                System.out.printf("Vysledok je: ");
                float vysledok_nasobenie = nasobenie(prve,druhe);
                System.out.println(vysledok_nasobenie);
            }
            else if (operacia == z)
            {
                System.out.printf("Vysledok je: ");
                float vysledok_delenie = delenie(prve,druhe);
                System.out.println(vysledok_delenie);
            }
            else
            {
                System.out.printf("Zadali ste neplatnú možnosť");
            }
            scanner.nextLine();
            System.out.println("Pre ukončenie napíš end pre pokracovanie lubovolny text: ");
            String koniec = scanner.nextLine();

            if(koniec.equals("end")){
                opakovanie = false;
            }

        }



    }

}

