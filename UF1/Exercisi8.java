/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.Primera_practica;

import static cat.Primera_practica.Exercisi8.MSG_1;
import java.util.Scanner;
//Andreu Furió Casanova
//Nom:
//Cognoms:
//INS Manuel Vázquez Montalbán
//Data d’edició:
//Nom del cicle formatiu:
//Nom del mòdul:

public class Exercisi8 {

    public static final String MSG_1 = "Introdueix un numero";
    public static final String MSG_2 = "Selecciona un apartat";
    public static final String MSG_3 = "Quina cuantitat de nombres vols?";
    public static final String MSG_4 = "Introdueix un numero";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, usuari, suma = 0, apartat, quantitat, contador = 0;

        System.out.println(MSG_2);
        apartat = sc.nextInt();

        switch (apartat) {
            case 1:
                do {
                    System.out.println(MSG_1);
                    num = sc.nextInt();
                } while (num != 0);
                System.out.println("Has escrit 0 el programa s'acabat");
            case 2:
                System.out.println(MSG_3);
                quantitat = sc.nextInt();

                do {
                    System.out.println(MSG_4);
                    usuari = sc.nextInt();
                    contador++;
                } while (contador != quantitat);
                System.out.println("Fi del programa");
        }

    }
}
