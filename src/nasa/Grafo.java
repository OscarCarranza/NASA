
package nasa;

import java.util.ArrayList;

public class Grafo {
   ArrayList <Planet> grafo = new ArrayList();

    public Grafo() {
    }
   
   public void addPlanet(Planet p){
       grafo.add(p);
   }
}