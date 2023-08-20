/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13_ej03.pkg04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia13_Ej0304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
        try {
        System.out.println("Ingrese un número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = leer.nextInt();
        
        
//        int num1Conver = Integer.parseInt(num1);
//        int num2Conver = Integer.parseInt(num2);
//        double result = num1Conver/num2Conver;
//            System.out.println("El resultado de la division es: " +  result);
       
        } catch (NumberFormatException a)  {  
            System.out.println(a.getMessage() + " Se ingresó un numero invalido");
        } catch (ArithmeticException b) {
            System.out.println(b.getMessage() + " Error al dividir");
        } catch(InputMismatchException e){
            System.out.println(e.getMessage() + " Ingresa bien los numeros banana");
        }
        
        
    }
        
        
        
    }
    

