/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase principal Perro que es un extension de AnimalTerrestre
 * @author brismar
 */
public class Perro extends AnimalTerrestre{
    /**
     * ATRIBUTOS 
     * colorCollar es de tipo entero pero sera privado
     */
    private String colorCollar;
    /**
     * CONSTRUCTOR VACIO
     */
    public Perro(){
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE Perro
     * @param colorCollar: colorCollar de perro
     * super - patas, nombre, lugarOrigen, color van acceder y llamar las funciones
     */
    public Perro(String colorCollar, int patas, String nombre, String lugarOrigen, String color) {
        super(patas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     *METODOS DE SERVICIO
     * @return las colorCollar de Perro
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * set - Le da valor del colorCollar del perro
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     *METODOS OBJETIVOS
     */
    public void hacerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos,
     * Metodo toString - que muestra los valores de los atributos
     */ 
    @Override
    public String toString() {
        return "Perro{" + "collar=" + colorCollar + '}';
    }
    
}