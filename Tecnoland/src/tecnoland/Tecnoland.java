/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnoland;

import java.util.Scanner;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Tecnoland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Jugador jogador;
        Juego j = new Juego();
        
        int opcion=5;
        do{
            opcion = leer.nextInt();
            switch(opcion){
                case 1: System.out.println("Añadir Jugador");
                        jogador = new Jugador(leer.next(), leer.next(), leer.next(), leer.nextInt());
                        j.añadirJugador(jogador);
                        break;
                case 2:
                        break;
                case 3: 
                        break;
                case 4: System.out.println(j.mostrarRanking());
                        break;
                    
            }
        }while(opcion!=0);
        
    }
    
}
