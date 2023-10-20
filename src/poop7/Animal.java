/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;
/**
 * Clase principal Animal 
 * @author brismar
 */
public class Animal extends Object{
    /**
     * ATRIBUTOS 
     * 
     */
    private String nombre, lugarOrigen, color;
    
    /**
     * CONSTRUCTOR VACIO
     */
    public Animal() {
    }
    
    /**
     *CONSTRUCTOR LLENO DE LA CLASE ANIMAL
     * @param nombre: nombre del animal
     * @param lugarOrigen:  lugarOrigen del animal
     * @param color: color del animal 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     *METODOS DE SERVICIO
     * Metodo get 
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *Le damos el valor a Nombre
     */
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return el lugarOrigen del animal
     */

    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Le damos valor a lugarOrigen al animal
     */

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * @return el color del animal
     */

    public String getColor() {
        return color;
    }
    /**
     *Le damos valor a color al animal
     */

    public void setColor(String color) {
        this.color = color;
    }
    
    /*+
    *METODOS OBJETIVOS
    */
    public void hacerSonido(){
        System.out.println("Hacer sonido..");
    }
    public void comer(){
        System.out.println("Estoy comiendo...");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }   
    
}


