/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Array {
    
    
     public void crearArray() {
      
      int vectorPrueba [] = {1, 3, 5, 8};
   
      
   Scanner leer = new Scanner(System.in);
   try {
      System.out.println("Ingrese el número de la posición 4: "+vectorPrueba[4]);
      
      
 }
  catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Intentaste acceder a un índice fuera de rango!!!"); 
  }
}
  
  
}

