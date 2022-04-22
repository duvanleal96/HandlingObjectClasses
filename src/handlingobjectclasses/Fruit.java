/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

import java.util.ArrayList;

/** Representa la clase Fruta y sus caracteristicas
 *
 * @author Duvan Leal
 */
public class Fruit {
 
    /**
     * Representa el nombre de la fruta
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta
     */
    private float averageWeight;
    /**
     * Representa una lista de colores de la fruta
     */
    public ArrayList<String> colors;
    
    /**
     * Representa el contructor , inicializar las variables 
     */
    public Fruit(){
        
    }
    /**
     * Representa el metodo de obtener colores 
     * @param colors
     */ 
    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Representa el metodo de capturar o guardar colores 
     * @param colors
     */ 
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
