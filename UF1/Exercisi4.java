/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.Primera_practica;

import static cat.Primera_practica.Exercisi3.MSG_1;
import java.util.Scanner;
//Andreu Furió Casanova
//Nom:
//Cognoms:
//INS Manuel Vázquez Montalbán
//Data d’edició:
//Nom del cicle formatiu:
//Nom del mòdul:

public class Exercisi4 {

    public static final String MSG_1 = "Introdueix un numero entre el 1 i el 12";
    public static final String MSG_2 = "No es dins l'interval";

    public static void main(String[] args) {
        int numMonth;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        numMonth = sc.nextInt();
        if (numMonth <= 12 && numMonth >= 1) {

            switch (numMonth) {
                case 1:
                    System.out.println("Gener");
                    break;
                case 2:
                    System.out.println("Febrer");
                    break;
                case 3:
                    System.out.println("Març");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maig");
                    break;
                case 6:
                    System.out.println("Juny");
                    break;
                case 7:
                    System.out.println("Juliol");
                    break;
                case 8:
                    System.out.println("Agost");
                    break;
                case 9:
                    System.out.println("Septembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Novembre");
                    break;
                case 12:
                    System.out.println("Desembre");
                    break;

            }
        } else {
            System.out.println(MSG_2);
        }
    }
}
