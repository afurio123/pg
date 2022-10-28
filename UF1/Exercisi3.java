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

public class Exercisi3 {

    public static final String MSG_1 = "Introdueix un valor";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if (num1 < 0) {
            System.out.println("Es negatiu");
        }
        if (num1 > 35) {
            System.out.println("Es major que 35");
        }
        if (num1 > 0 && num1 < 100) {
            System.out.println("Es positiu i menor que 100");
        }
        if (num1 > -3 && num1 < 27) {
            System.out.println("Esta en l'interval -3 i 27");
        }
        if (num1 < 25 && num1 > 50) {
            System.out.println("No es dins de l'interval 25 i 50");
        }
        if (num1 % 2 != 0) {
            System.out.println("Es parell");
        }
        if (num1 % 2 == 0) {
            System.out.println("El quadrat seria" + num1 * num1);
        } else {
            if (num1 % 2 != 0) {
                System.out.println("El cub seria" + num1 * num1 * num1);
            }
            if (num1 > num2) {
                System.out.println("El més gran es: " + num1);
            } else {
                if (num2 > num1) {
                    System.out.println("El més gran es: " + num2);
                }
            }
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El més gran es: " + num1);
                } else {
                    System.out.println("El més gran es: " + num3);
                }
            } else if (num2 > num3) {
                System.out.println("El més gran es: " + num2);
            } else {
                System.out.println("El més gran es: " + num3);
            }
            if (num1 % num2 == 0) {
                System.out.println(num1 + "es multiple de" + num2);
            }
            if (num2 % num1 == 0) {
                System.out.println(num2 + "es multiple de" + num1);
            }
        }
    }
}
