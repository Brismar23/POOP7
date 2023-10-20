/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * CLASE PRINCIPAL BALLENA 
 * @author brismar
 */
public class Ballena extends AnimalAcuatico{
    /**
     * ATRIBUTOS 
     */
    private int largo;
    /**
     * CONSTRUCTOR VACIO
     */
    public Ballena() {
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE ANIMAL
     * @param largo: largo de ballena
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     *METODOS DE SERVICIO
     * Metodo get 
     * @return el nombre del animal
     */

    public int getLargo() {
        return largo;
    }
    /**
     * Le da valor lo largo de la ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
    *METODOS OBJETIVOS
    */
    
    public void pelarConPinocho(){
        System.out.print("Estoy peleando...");
     
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos, Metodo toString - que muestra los valores de los atributos
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }
    
    
}
