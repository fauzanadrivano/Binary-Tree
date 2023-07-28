package BinaryTree;

import CobaModul.BinaryTree;

import java.util.Scanner;

public class Fungsi {
    static CobaModul.BinaryTree pohon = new BinaryTree();
    static Scanner x = new Scanner(System.in);
    static Scanner y = new Scanner(System.in);
    static Scanner z = new Scanner(System.in);
    static String inputan, input;

    public static void menu(){
        int pilihan;
        System.out.println("\n\n*========== Skewed ===========*");
        System.out.println("| 1. Masukkan Input            |");
        System.out.println("| 2. Tampilkan                 |");
        System.out.println("| 3. keluar                    |");
        System.out.println("*==============================*");

        try {
            System.out.print("| Masukkan pilihan : ");
            pilihan = z.nextInt();
            switch (pilihan){
                case 1:
                    inputanUser();
                case 2:
                    view();
                    menu();
                case 3:
                    System.out.println("Terima kasih :)");
                    System.exit(0);
                default:
                    System.out.println("Inputan tidak valid !!!");
                    menu();
            }
        }catch (Exception e){
            System.out.println("Inputan tidak valid !!!");
        }
    }

    static void inputanUser(){
        do {
            try {
                System.out.print("\nMasukkan Inputan : ");
                inputan = x.next();
                pohon.NewNode(inputan);
                ulang();
            } catch (Exception e){
                System.out.println("Inputan tidak valid !!!");
                ulang();
            }
        }while (input.equals("y"));
    }

    static void view(){
        System.out.println("\n\nPre Order : ");
        pohon.preOrder(pohon.root);
        System.out.println("\n\nin Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\n\nPost Order : ");
        pohon.postOrder(pohon.root);
    }

    static void ulang(){
        try {
            System.out.println("\nIngin memasukkan inputan lagi ?");
            System.out.print("y/n : ");
            input = y.next();
            if (input.equals("y")){
                inputanUser();
            } else if (input.equals("n")){
                menu();
            } else {
                System.out.println("Inputan tidak valid !!!");
                ulang();
            }
        }catch (Exception e){
            System.out.println("Inputan tidak valid !!!");
            ulang();
        }
    }
}
