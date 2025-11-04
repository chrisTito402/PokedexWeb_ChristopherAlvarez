/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chris
 */
public class Pokemon {
    
    private String nombre;
    private int numero;
    private String tipo;
    private String imagenUrl;

    public Pokemon(int numero,String nombre, String tipo, String imagenUrl) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.imagenUrl = imagenUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }
}
