
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
    
    public int Travel(int pesoTot,Planet a, Planet b){
        
        ArrayList <Route> paths = this.getRoutes();
        int cont = 0, temp = 0;
        for(int i = 0; i < paths.size(); i++){
            if(paths.get(i).getNodo1() == a || paths.get(i).getNodo2() == a){
                int p = paths.get(i).getPeso(); 
                if(cont == 1){
                    pesoTot = Math.min(p, temp);
                    cont = 0;
                }
                temp = p;
                cont++;
            }
        }
        
        
        
        return 0;
    }
    
}