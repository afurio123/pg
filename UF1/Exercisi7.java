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

public class Exercisi7 {

    public static final String MSG_1 = "Aquests són els numeros del 0 al 10";
    public static final String MSG_2 = "Aquests són els numeros del 0 al 100";
    public static final String MSG_3 = "Aquests són els numeros del 100 al 0";
    public static final String MSG_4 = "Aquests són els 100 primer numeros parells";

    public static void main(String[] args) {
        int a = -1, b = -1, c = 101, d = 0;
        System.out.println(MSG_1);
        while (a < 10) {
            a++;
            System.out.println(a);
        }

        System.out.println(MSG_2);
        while (b < 100) {
            b++;
            System.out.println(b);
        }

        System.out.println(MSG_3);
        while (c > 0) {
            c--;
            System.out.println(c);
        }
        
        System.out.println(MSG_4);
        while (d<=200) {
            if(d%2==0){
                System.out.println(d);
            }
            d++;
        }    
    }
}