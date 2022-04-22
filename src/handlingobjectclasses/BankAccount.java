/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingobjectclasses;

/**Representa la clase cuenta bancaria y sus parámetros
 *
 * @author Duvan Leal
 */
public class BankAccount {
    /**
     * Representa el número de cuenta bancaria
     */
    private int accountNumber;
    /**
     * Representa la validación si esta activada o no la cuenta
     */
    protected boolean activated;
    
    /**
     * Representa el metodo obtener si la cuenta esta activa o no 
     * @return true o false
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * Representa el metodo guardar la validación 
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
