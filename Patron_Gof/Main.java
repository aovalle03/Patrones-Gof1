/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Gof;

/**
 *
 * @author andyf
 */
public class Main {

   
    public static void main(String[] args) {
        
         CalificacionEstudiante x = new CalificacionEstudiante();
     PonerCalificacion p = new PonerCalificacion();
     p.enlazarobservador(x);
     p.subircalificacion();
      
    }
    
}
