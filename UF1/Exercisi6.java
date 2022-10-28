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
public class Exercisi6 {

    public static final String MSG_1 = "Introdueix un any qualsevol";
    public static final String MSG_2 = "Introdueix un mes qualsevol";
    public static final String MSG_3 = "El total de dies seria: ";

    public static void main(String[] args) {
        int numAny, numMes;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        numAny = sc.nextInt();
        System.out.println(MSG_2);
        numMes = sc.nextInt();
        if (numMes <= 12 && numMes >= 1 && numAny % 4 == 0 && numAny % 100 != 0 || (numAny % 400 == 0)){
            switch (numMes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Te 31 dies");
                    break;
                case 2:
                    System.out.println("Te 28 dies");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Te 30 dies");
                    break;
            }
        }else{switch (numMes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Te 31 dies");
                    break;
                case 2:
                    System.out.println("Te 29 dies");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Te 30 dies");
                    break;  
        }
    }
}
}
