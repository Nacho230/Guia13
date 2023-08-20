/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13_ej01;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author nacho
 */
public class Guia13_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio n1 = new PersonaServicio();

        Persona p1 = new Persona();
        try {

            System.out.println(p1);
            //System.out.println(n1.esMayorDeEdad(p1));

            if (p1.getEdad() == 0) {

                throw new Exception("Primero ingrese la edad de la persona para saber si es mayor de edad o no");

            }

        } catch (Exception a) {
            System.out.println(a.getMessage());

        }

        try {

            if (!n1.esMayorDeEdad(p1)) {

                throw new Exception("Primero ingrese el genero de la persona");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
