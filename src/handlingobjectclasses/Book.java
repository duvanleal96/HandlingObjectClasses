/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

/**Representa la clase libro y sus características 
 *
 * @author Duvan Leal
 */
public class Book {
    /**
     * Representa el numero de paginas del libro
     */
    protected int numberPages;
    /**
     * Representa el nombre del libro
     */
    private String name;
    /**
     * Representa el tipo de libro
     */
    public String type;
    /**
     * Representa el método guardar nombre del libro
     * @param name 
     */
    private void setName(String name){
        this.name=name;
    }
    /**
     * Representa el método obtener nombre del libro
     * @param name
     * @return name
     */
    private String ConsultName(){
        return name;
    }
    
}
