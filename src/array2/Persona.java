/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2;

import java.util.ArrayList;

/**
 *
 * @author Sena
 */
public class Persona {
    
    //Clase persona
    
    ArrayList Nombre;
    ArrayList Edad;
    ArrayList profesion;

    public Persona(ArrayList Nombre, ArrayList Edad, ArrayList profesion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.profesion = profesion;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getEdad() {
        return Edad;
    }

    public void setEdad(ArrayList Edad) {
        this.Edad = Edad;
    }

    public ArrayList getProfesion() {
        return profesion;
    }

    public void setProfesion(ArrayList profesion) {
        this.profesion = profesion;
    }
    
    
    
    
}
