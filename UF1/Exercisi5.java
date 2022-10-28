/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.Primera_practica;
import java.util.Scanner;
//Andreu Furió Casanova
//Nom:
//Cognoms:
//INS Manuel Vázquez Montalbán
//Data d’edició:
//Nom del cicle formatiu:
//Nom del mòdul:

public class Exercisi5 {

    public static final String MSG_1 = "Introdueix un any qualsevol";
    public static final String MSG_2 = "Es un any de traspas";
    public static final String MSG_3 = "No es un any de traspas";

    public static void main(String[] args) {
        int numAny;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        numAny = sc.nextInt();
        if ((numAny % 4 == 0) && ((numAny % 100 != 0) || (numAny % 400 == 0))) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
