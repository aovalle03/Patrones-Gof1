
package Patron_Gof;

import java.util.ArrayList;


public class PonerCalificacion  implements SujetoObservable {
     private ArrayList<Observador> observadores;
    
    public PonerCalificacion(){
        observadores = new ArrayList<Observador>();
    }
    
    public void subircalificacion(){
        notificar();
    }
    
    public void enlazarobservador (Observador o) {
        observadores.add (o) ;
    };

    @Override
    public void notificar() {
        for(Observador o: observadores){
            o.update();
        }
        
        
      
    }
    
}
