/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *CLASE PIRNCIPAL ANIMALACUATICO
 * @author brismar
 */
public class AnimalAcuatico extends Animal{
    /**
     * ATRIBUTOS 
     */
    private int numeroAletas;
    /**
     * CONSTRUCTOR VACIO
     */
    public AnimalAcuatico() {
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE ANIMAL
     * @param numeroAletas: numeroAletas de ballena
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color){
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     *METODOS DE SERVICIO
     * @return el numeroAletas de Ballena
     */

    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     *Le damos el valor a NumeroAletas a Ballena
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /*+
    *METODOS OBJETIVOS
    */
   
    public void nadar(){
        System.out.println("Estoy nadanso");
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiendo pescado");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos, Metodo toString - que 
     * muestra los valores de los atributos
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + super.toString() +'}';
    }    
}
