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
public class Exercisi9 {
    public static final String MSG_1 = "Introdueix un numero";
    public static final String MSG_2 = "La mitjana de les notes seria ";
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float num1 = 1, suma = 0;
    int cont = 0;
    System.out.println(MSG_1);
    num1 = sc.nextInt();
    
    while(num1 > 0){
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if (num1 > 0){
            suma=suma+num1;
            cont++;      
        }    
    }
    
    if (cont > 0){
        System.out.println(MSG_2 + suma/cont);
    }
 
}
}