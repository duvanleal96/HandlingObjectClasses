/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

/** Representa la clase carro con sus características 
 *
 * @author Duvan Leal
 */
public class Car {
    /**
     * Representa el modelo del carro
     */
    private String model;
    /**
     * Representa el número de asientos
     */
    public byte numberSeats;
    /**
     * representa la marca del carro
     */
    protected String mark;
    /**
     * Representa el metodo guardar modelo del auto
     * @param model 
     */
   
    private void setModel(String model){
        this.model = "renault";
    }
    /**
     * Representa el metodo obtener modelo del auto
     * @return model 
     */
    private String getModel(){
        return model;
    }
  
}
