/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author barbi
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);   
       int num1,num2,suma;
       int nombre;
       int numeros;
        System.out.println("ingrese el primer numero:");
     num1= leer.nextInt();
        System.out.println("ingrese el segundo numero");
     num2= leer.nextInt();
     suma=num2+num1;
     nombre=5;
      System.out.println("el resultado del "+ num1 +"+" +num2+ " = "+suma);
        System.out.println("nombre ="+nombre);
// TODO code application logic here
    }
    
}
