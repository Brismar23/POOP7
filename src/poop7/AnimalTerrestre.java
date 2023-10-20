/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase principal AnimalTerrestre
 * @author brismar
 */
public class AnimalTerrestre extends Animal{
    /**
     * ATRIBUTOS 
     * patas es de tipo entero pero sera privado
     */
    private int patas;
    /**
     * CONSTRUCTOR VACIO
     */
    public AnimalTerrestre(){
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE AnimalTerrestre
     * @param patas: patas de ballena
     * @super nombre, lugarOrigen, color van acceder y llamar las funciones
     */
    public AnimalTerrestre(int patas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.patas = patas;
    }
    /**
     *METODOS DE SERVICIO
     * Metodo get 
     * @return las patas del animal-perro
     */
    public int getPatas() {
        return patas;
    }
    /**
     * Set - Le da valor lo de las patas del perro
     */

    public void setPatas(int patas) {
        this.patas = patas;
    }
    /**
     *METODOS OBJETIVOS
     */
    public void correr(){
        System.out.println("estoy corriendo");
    }  
    /**
     * override - implementación de un método llamado comer en una clase que sobrescribe
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo carne");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos, Metodo toString - que muestra los valores de los atributos
     */ 
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "patas=" + patas +  super.toString() +'}';
    }
  
  
}