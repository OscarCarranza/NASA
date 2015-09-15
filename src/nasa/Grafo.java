
package nasa;

import java.util.ArrayList;

public class Grafo {
   ArrayList <Planet> grafo = new ArrayList();
   ArrayList <Route> routes = new ArrayList();

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
   
   public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }
    
    
    public void removeRoutesOf(Planet p1){
        for(int i = 0; i < routes.size(); i++){
            if(p1.getName().equals(routes.get(i).getNodo1().getName()) || p1.getName().equals(routes.get(i).getNodo2().getName())){
                routes.remove(i);
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    
    public void addRoute(Planet start, Planet destiny, int distance){
        Route newPath = new Route(start,destiny,distance);
        routes.add(newPath);
    }
}
