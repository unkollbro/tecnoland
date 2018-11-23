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
public class Juego {
    private int id_juego;
    private String nombre_juego;
    private Jugador[] vJugadores;

    public Juego() {
        id_juego=0;
        nombre_juego=nombre_juego;
        vJugadores = new Jugador[10];
        
        vJugadores[0] = new Jugador("Catalin", "Ciurcanu", "uNKoLL", 99999);
        vJugadores[1] = new Jugador("Alfredo", "Caspe", "Alfmachine", 0);
        vJugadores[2] = new Jugador("Marcos", "Omella", "Marek", 0);
        vJugadores[3] = new Jugador("Adrian", "Zuñiga", "enoldor", 0);
    }
    
    public Juego(int id_juego, String nombre_juego, Jugador[] vJugadores) {
        this.id_juego = id_juego;
        this.nombre_juego = nombre_juego;
        this.vJugadores = vJugadores;
    }
    
    public void añadirJugador(Jugador j){
        boolean encontrado = false;
        for (int i = 0; i < vJugadores.length; i++) {
            if(j.getNombre_jugador().equals(vJugadores[i])){
                encontrado = true;
                System.out.println("El nombre ya existe");
                break;
            }
        }
        if(encontrado==false){
            for (int i = 0; i < vJugadores.length; i++) {
                if(vJugadores[i]==null){
                    vJugadores[i]=j;
                    break;
                }
            }
        }
        
    }
    
    public void borrarJugador(Jugador j){
        for (int i = 0; i < vJugadores.length; i++) {
            if(j.equals(vJugadores[i].getNombre_jugador())){
                vJugadores[i]=null;
            }
        }
    }
    
    public void sumarPuntos(Jugador nick){
        
    }
    
    public String mostrarRanking(){
        String ranking="";
        
        for(Jugador j: vJugadores){
            if(j!=null){
                ranking +=j;
            }
        }    
        
        return ranking;
    }
}
