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
public class CalificacionEstudiante implements Observador{
    
    public CalificacionEstudiante(){
        
    }

    @Override
    public void update() {
        System.out.println("Querido estudiante ya tiene una calificacion en la actividad 4 materia FUNDAMENTOS DE DISEÑO");
              
    
}
}