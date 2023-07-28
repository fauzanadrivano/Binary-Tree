package BinaryTreeLink;

import java.util.Scanner;

public class Tools {
    static FullBinaryTree pohon = new FullBinaryTree();
    static Scanner x = new Scanner(System.in);
    static Scanner y = new Scanner(System.in);
    static Scanner z = new Scanner(System.in);
    static String inputan, input;
    static node root = new node();
    static int cekRoot = 1;

    public static void menu(){
        int pilihan;

        System.out.println("\n\n*============ Full ============*");
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
                if (cekRoot == 1){
                    root.input(inputan);
                    cekRoot--;
                } else {
                    pohon.insert(root, inputan);
                }
                ulang();
            } catch (Exception e){
                System.out.println("Inputan tidak valid !!!");
                ulang();
            }
        }while (input.equals("y"));
    }

    static void view(){
        System.out.println("\n\nPre Order : ");
        pohon.preOrder(root);
        System.out.println("\n\nin Order : ");
        pohon.inOrder(root);
        System.out.println("\n\nPost Order : ");
        pohon.postOrder(root);
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
