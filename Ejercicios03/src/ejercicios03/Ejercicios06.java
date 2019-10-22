/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String universidad;
        
        System.out.println("Ingrese su nombre"); 
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su universidad");
        universidad= entrada.nextLine();      
       
        System.out.print("Mi nombre es\n\t"+ nombre + "\n" + 
                "Mi universidad es\n\t"+ universidad + "\n");
    }
    
}
