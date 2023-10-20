/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase principal AnimalAereo con esxtension a las clase Animal
 * @author brismar
 */
public class AnimalAereo extends Animal{
    /**
     * ATRIBUTOS 
     * alas es de tipo entero pero sera privado
     */
    private int alas;
    /**
     * CONSTRUCTOR VACIO
     */
    public AnimalAereo(){
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE AnimalAereo
     * @param alas: alas de pajaro
     * super - nombre, lugarOrigen, color van acceder y llamar las funciones
     */
    public AnimalAereo(int alas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.alas = alas;
    }
    /**
     *METODOS DE SERVICIO
     * @return las Alas de Pajaro
     */
    public int getAlas() {
        return alas;
    }
    /**
     * set - Le da valor del alas del pajaro
     */

    public void setAlas(int alas) {
        this.alas = alas;
    }
    /**
     * Metodo de objetivos
     * metodo volar imprimira la ccion de estoy volando
     */
    public void volar(){
        System.out.println("estoy volando");
    } 
    /**
     * override - implementación de un método llamado comer en una clase que sobrescribe
     * este metodo hara la accion que esta comiendo
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo insectos");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos, Metodo toString - que muestra 
     * los valores de los atributos
     */ 
    @Override
    public String toString() {
        return "AnimalAereo{" + "alas=" + alas +  super.toString() +'}';
    }
  
  
}