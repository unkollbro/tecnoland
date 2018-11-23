/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnoland;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Jugador {
    private String nombre_jugador;
    private String apellido_jugador;
    private String nick_jugador;
    private int puntos_jugador;

    public Jugador() {
        nombre_jugador="";
        apellido_jugador="";
        nick_jugador="";
        puntos_jugador=0;
    }

    public Jugador(String nombre_jugador, String apellido_jugador, String nick_jugador, int puntos_jugador) {
        this.nombre_jugador = nombre_jugador;
        this.apellido_jugador = apellido_jugador;
        this.nick_jugador = nick_jugador;
        this.puntos_jugador = puntos_jugador;
    }
    
    
    public String toString(){
        String jugador=
                "\n****************"+
                "\nNombre: "+nombre_jugador+ 
                "\n Nick: "+nick_jugador+
                "\n Puntos del jugador: "+puntos_jugador;
           
        
        return jugador;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public String getNick_jugador() {
        return nick_jugador;
    }

    public String getApellido_jugador() {
        return apellido_jugador;
    }

    public int getPuntos_jugador() {
        return puntos_jugador;
    }
    
    
}
