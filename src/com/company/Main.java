package com.company;

public class Main {

    public static void main(String[] args) {
        int lado = 10;

        for (int i = 0; i < lado; i++) {
            System.out.print("0 ");
            for (int j = 0; j < lado - 2; j++) {
                if (i > 0 && i < lado - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("0");
        }

        // Solución de Román
        /*for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || j == 0 || i == lado - 1 || j == lado - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
    }
}
