/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

/**Representa la clase estudiante 
 *
 * @author Duvan Leal
 */
public class Student {
    /**
     * Representa el nombre del estudiante
     */
    private String name;
    /**
     * Representa el número de cartnet del estudiante
     */
    protected String carnet;
    /**
     * Representa el grado que cursa el estudiante
     */
    public byte grade;
    
    /**
     * Representa la inicialización de las variables guarda los datos como set
     */
    public Student(){
        this.carnet="1234";
        this.name="carlos";
        this.grade=11;
    }
    /**
     * Representa el metodo obtener carnet de estudiante
     * @return 
     */
    public String getCarnet(){
        return carnet;
    }
    /**
     * Representa el metodo obtener nombre de estudiante
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * Representa el metodo obtener carnet de estudiante
     * @return 
     */
    private void nombreCarnet(){
        System.out.println("el nombre es :"+ name);
    }
}
