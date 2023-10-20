/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * Clase principal Pajaro con extension a la clase AnimalAereo
 * @author brismar
 */
public class Pajaro extends AnimalAereo{
    /**
     * ATRIBUTOS 
     * tipoPico es de tipo entero pero sera privado
     */
    private String tipoPico;
    /**
     * CONSTRUCTOR VACIO
     */
    public Pajaro(){
    }
    /**
     *CONSTRUCTOR LLENO DE LA CLASE AnimalAereo
     * @param tipoPico: tipoPico de pajaro
     * super - alas, nombre, lugarOrigen, color van acceder y llamar las funciones
     */
    public Pajaro(String tipoPico, int alas, String nombre, String lugarOrigen, String color) {
        super(alas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     *METODOS DE SERVICIO
     * @return el tipoPico de Pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * set - Le da valor o dato del tipoPico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     *METODOS OBJETIVOS
     * metodo reoolectarRamas que imprimira la accion de estoy recolectando ramas
     */
    public void recolectarRamas(){
    System.out.println("Estoy recolectando ramas");
    }
    /**
     * Metodos de Sobreescritura 
     * @return - regresa la concatenacion de los valores de los atributos,Metodo toString-que
     * muestra los valores de los atributos
     */ 
    @Override
    public String toString() {
        return "Pajaro{" + "TipoPico=" + tipoPico + '}';
    }
}