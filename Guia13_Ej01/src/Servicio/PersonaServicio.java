/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();
        boolean verificar = false;
        //String genero = "";
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());

        System.out.println(" Ingrese la edad de la persona: ");
        p1.setEdad(leer.nextInt());

        do {
            System.out.println("Ingrese el genero de la persona: ");
            String genero = leer.next();
            if (genero.equalsIgnoreCase("h") || genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("o")) {
                p1.setSexo(genero);
                //System.out.println("Correcto");
                verificar = true;
            } else {
                System.out.println("Ingresaste un genero incorrecto");
            }
        } while (!verificar);

        System.out.println("Ingrese el peso de la persona : ");
        p1.setPeso(leer.nextDouble());
        //System.out.println("El peso de la persona es: " + p1.getPeso());

        System.out.println("Ingrese la altura de la persona : ");
        p1.setAltura(leer.nextDouble());
        //System.out.println("La altura de la persona es: " + p1.getAltura());
        return p1;

    }

    public boolean esMayorDeEdad(Persona personita) {
        return personita.getEdad() >= 18;
    }

    public int calcularPeso(Persona personita) {
        double imc = personita.getPeso() / Math.pow(personita.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

}
