/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

import java.util.Date;

/** Representa la clase Persona y sus características 
 *
 * @author Duvan Leal
 */
public class Person {
      /**
     * Representa el nombre 
     */
    public String name;
     /**
     * Representa el primer apellido
     */
    public String lastName1;
     /**
     * Representa el segundo apellido
     */
    public String lastName2;
     /**
     * Representa la fecha de cumpleaños
     */
    public Date datebirth;
     /**
     * Representa la altura
     */
    public float heigth;
  
     /**
     * Representa el metodo obtener el nombre
     * retorna nombre 
     */
    public String getName() {
        return name;
    }
     /**
     * Representa el metodo guardar nombre como parametro nombre
     */
    public void setName(String name) {
        this.name = name;
    }

}
