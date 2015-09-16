
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
        int cont = 0, temp = 0, contTemp = 0;
        Planet dest = null;
        for(int i = 0; i < paths.size(); i++){
            if(paths.get(i).getNodo1() == a || paths.get(i).getNodo2() == a){
                cont++;
                int p = paths.get(i).getPeso(); 
                if(cont == 2){
                    pesoTot = Math.min(p, temp);
                    if(p == pesoTot && paths.get(i).getNodo1() == a){
                        dest = paths.get(i).getNodo2();
                    }
                    else if(p == pesoTot && paths.get(i).getNodo2() == a){
                        dest = paths.get(i).getNodo1();
                    }
                    else if(temp == pesoTot && paths.get(contTemp).getNodo1() == a){
                        dest = paths.get(contTemp).getNodo2();
                    }
                    else if(temp == pesoTot && paths.get(contTemp).getNodo2() == a){
                        dest = paths.get(contTemp).getNodo1();
                    }
                    cont = 0;
                }
                contTemp = i;
                temp = p;
            }
            contTemp++;
        }
        
         if(b == dest){
             return pesoTot;
         }
         else{
             return Travel(pesoTot,dest,b);
         }
    }
    
}