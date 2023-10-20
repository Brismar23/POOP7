/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;


/**
 * CLASE PIRNCIPAL - MAIN - Nos guarda la infomacion de las demas clases
 * @author brismar
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Le damos los parametros a la clase Animal
         */
        Animal animal = new Animal();
        animal.setColor("Cafe");
        animal.setNombre("Torvi");
        animal.setLugarOrigen("Canada");
        /**
         * Nos imrpime nuestra cadena de Animal
         */
        System.out.println(animal.toString());
        
        /**
         * Le damos los parametros a la clase AnimalAcuatico con extension a la clase Animal
         */
        // animalacutico - Ballena
        AnimalAcuatico animalAcuatico = new AnimalAcuatico();
        animalAcuatico.setNombre("Dori");
        animalAcuatico.setLugarOrigen("Los Cabos");
        animalAcuatico.setColor("Gris");
        animalAcuatico.setNumeroAletas(4);
        System.out.println(animalAcuatico);
        
        
        Ballena ballena=new Ballena(25,2,"azul", "Canada","gris");
        System.out.println(ballena);
        
        /**
         * Le damos los parametros a la clase AnimalTerrestre con extension a la clase Animal
         */
        //AnimalTesrrestre - Perro
        AnimalTerrestre animalTerrestre = new AnimalTerrestre();
        animalTerrestre.setColor("naranja");
        animalTerrestre.setLugarOrigen("Condesa");
        animalTerrestre.setNombre("Jaguer");
        animalTerrestre.setPatas(4);
        System.out.println(animalTerrestre);
        
        Perro perro= new Perro("rosa", 4, "Jaguer", "chicago", "cafe");
        System.out.println(perro);

        /**
         * Le damos los parametros a la clase AnimalAereo con extension a la clase Animal
         */
        //AnimalAereo - Pajaro
        AnimalAereo animalAereo = new AnimalAereo();
        animalAereo.setColor("Amarrillo");
        animalAereo.setLugarOrigen("Francia");
        animalAereo.setNombre("Pavaroti");
        animalAereo.setAlas(2);
        
        System.out.println(animalAereo);
        
        Pajaro pajaro= new Pajaro("Largo", 2, "Pavaroti", "Italia", "Amarillo con cafe");
        System.out.println(pajaro);
               
       
    }    
}
