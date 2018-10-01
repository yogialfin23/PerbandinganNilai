package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n1;
        int n2;
        String ulang;
        Scanner scn = new Scanner(System.in);

        System.out.println("========Program Perbandingan Nilai========");

        do {
            System.out.print("Masukkan nilai pertama\t : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua\t : ");
            n2 = scn.nextInt();

            if (n1 > n2) {
                System.out.println("Hasil\t\t\t : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil\t\t\t : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil\t\t\t : "+n1+" sama dengan "+n2+"\n");

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulang = scn.next();

            System.out.println("");
        } while (!ulang.equals("Tidak"));
    }
}
