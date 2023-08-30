package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Napisi sledece formule u Java programskom jeziku:
        int n = 10;
        int result1 = n * (n - 1) / 2;
        System.out.println("Rezultat: " + result1);

        double r = 3.5;
        double a = 0.8;
        double result2 = Math.sqrt(Math.pow(r * Math.cos(a), 2) + Math.pow(r * Math.sin(a), 2));
        String formattedResult2 = String.format("%.2f", result2);
        System.out.println("Rezultat: " + formattedResult2);

        int x1 = 3;
        int x2 = 4;
        int y1 = 5;
        int y2 = 6;
        double result3 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        String formattedResult3 = String.format("%.2f", result3);
        System.out.println("Rezultat: " + formattedResult3);

        // 2. Napisi program koji racuna zapreminu i povrsinu sfere za dati poluprecnik. Zapremina sfere je
        // V = 4/3*Pi*r3, a povrsina je A = 4*Pi*r2.
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite poluprecnik sfere: ");
        double radius = input.nextDouble();

        double V = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double A = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Zapremina sfere sa poluprecnikom %.2f je %.2f.\n", radius, V);
        System.out.printf("Povrsina sfere sa poluprecnikom %.2f je %.2f.\n", radius, A);

        // 3. Napisi program koji izracunava povrsinu trougla za date duzine stranica a, b i c. s = (a+b+c) / 2
        // A = sqrt(s(s - a)(s - b)(s - c))
        System.out.print("Unesite duzinu stranice a: ");
        double triangleA = input.nextDouble();

        System.out.print("Unesite duzinu stranice b: ");
        double triangleB = input.nextDouble();

        System.out.print("Unesite duzinu stranice c: ");
        double triangleC = input.nextDouble();

        double s = (triangleA + triangleB + triangleC) / 2;
        double P = Math.sqrt(s * (s - triangleA) * (s - triangleB) * (s - triangleC));

        String formattedPovrsina = String.format("%.2f", P);
        System.out.println("Povrsina trougla je: " + formattedPovrsina);

        // 4. Napisi program koji za broj bodova na testu ispisuje ocenu sa testa. Student na testu moze da
        // osvoji od 0 do 100 bodova. Ocenjivanje je dato u tabeli:
        // bodovi ocene
        // od 0 do 50 5
        // od 51 do 60    6
        // od 61 do 70    7
        // od 71 do 80    8
        // od 81 do 90    9
        // od 91 do 100  10
        Scanner inputBodovi = new Scanner(System.in);
        System.out.print("Unesite broj bodova na testu: ");
        int bodovi = inputBodovi.nextInt();

        int ocena;
        if (bodovi >= 0 && bodovi <= 50) {
            ocena = 5;
        } else if (bodovi >= 51 && bodovi <= 60) {
            ocena = 6;
        } else if (bodovi >= 61 && bodovi <= 70) {
            ocena = 7;
        } else if (bodovi >= 71 && bodovi <= 80) {
            ocena = 8;
        } else if (bodovi >= 81 && bodovi <= 90) {
            ocena = 9;
        } else if (bodovi >= 91 && bodovi <= 100) {
            ocena = 10;
        } else {
            System.out.println("Uneti broj bodova nije validan!");
            return;
        }

        System.out.println("Ocena na testu: " + ocena);

        // 5. Indeks telesne mase se racuna po sledecoj formuli BMI = m / h2 u kojoj je m masa u kilogramima, a
        // h visina u metrima. U tabeli je data preporucena klasifikacija indeksa telesne mase:
        // BMI Klasifikacija
        // < 18,5 pothranjenost
        // 18,5 - 25 idealna tezina
        // 25 - 30 preterana tezina
        // > 30 gojaznost
        //Napisi program koji za zadatu tezinu u kilogramima i visinu ispisuje kategoriju iz klasifikacije BMI.
        Scanner scannerTezina = new Scanner(System.in);

        System.out.print("Unesite svoju tezinu u kilogramima: ");
        double m = scannerTezina.nextDouble();

        System.out.print("Unesite svoju visinu u metrima: ");
        double h = scannerTezina.nextDouble();

        double bmi = m / (h * h);

        if (bmi < 18.5) {
            System.out.println("BMI klasifikacija: Pothranjenost");
        } else if (bmi < 25) {
            System.out.println("BMI klasifikacija: Idealna tezina");
        } else if (bmi < 30) {
            System.out.println("BMI klasifikacija: Preterana tezina");
        } else {
            System.out.println("BMI klasifikacija: Gojaznost");
        }

        // 6. Napisi program koji za redni broj dana u nedelji ispisuje koji je to dan.
        Scanner scannerDan = new Scanner(System.in);
        System.out.print("Unesite redni broj dana u nedelji: ");
        int brojDana = scannerDan.nextInt();

        switch (brojDana) {
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Četvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("Uneli ste nevalidan redni broj dana.");
        }

        // 7. Napisi program koji ispisuje brojeve iz sledecih intervala (pokusati sa raznim petljama):
        // • [0, 10]
        // • [1, 15] sa korakom 2
        // • [21, 3]
        // • [17, -10] sa korakom -3
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int iPrimer2 = 1;
        while (iPrimer2 <= 15) {
            System.out.print(iPrimer2 + " ");
            iPrimer2 += 2;
        }

        System.out.println("\n");

        int iPrimer3 = 21;
        do {
            System.out.print(iPrimer3 + " ");
            iPrimer3--;
        } while (iPrimer3 >= 3);

        System.out.println("\n");

        for (int i = 17; i >= -10; i -= 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // 8. Napisi program koji za zadato n izracunava zbir prvih n prirodnih brojeva.
        Scanner inputN = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int zadatoN = inputN.nextInt();

        int suma = 0;
        for (int i = 1; i <= zadatoN; i++) {
            suma += i;
        }

        System.out.println("Zbir prvih " + zadatoN + " prirodnih brojeva je " + suma + ".");

        // 9. Napisi program koji za zadati niz brojeva:
        // • ispisuje najmanji element niza
        // • ispisuje najveci element niza
        // • ispisuje sumu vrednosti u nizu
        // • ispisuje srednju vrednost za niz
        Scanner inputNiz = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int zadatiNiz = inputNiz.nextInt();

        int[] niz = new int[zadatiNiz];
        int sum = 0;

        for (int i = 0; i < zadatiNiz; i++) {
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            niz[i] = inputNiz.nextInt();
            sum += niz[i];
        }

        int min = niz[0];
        int max = niz[0];
        double avg = 0;

        for (int i = 1; i < zadatiNiz; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
            if (niz[i] > max) {
                max = niz[i];
            }
        }

        avg = (double) sum / zadatiNiz;

        System.out.println("Najmanji element u nizu je: " + min);
        System.out.println("Najveci element u nizu je: " + max);
        System.out.println("Suma vrednosti u nizu je: " + sum);
        System.out.println("Srednja vrednost niza je: " + avg);
    }
}
