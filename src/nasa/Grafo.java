
package nasa;

import java.util.ArrayList;

public class Grafo {
   ArrayList <Planet> grafo = new ArrayList();

    public Grafo() {
    }
   
   public void addPlanet(Planet p){
       grafo.add(p);
   }
   
   public Planet getPlanetIn(int i){
       return grafo.get(i);
   }
   
   public void removePlanetIn(int i){
       grafo.remove(i);
   }
   
   public ArrayList <Planet> getPlanets(){
       return grafo;
   }
}
