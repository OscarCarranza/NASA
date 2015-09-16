
package nasa;

import nasa.Planet;

public class Route {
    
    private Planet nodo1;
    private Planet nodo2;
    private int peso;

    public Route(Planet nodo1, Planet nodo2, int peso) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.peso = peso;
    }

    public Planet getNodo1() {
        return nodo1;
    }

    public void setNodo1(Planet nodo1) {
        this.nodo1 = nodo1;
    }

    public Planet getNodo2() {
        return nodo2;
    }

    public void setNodo2(Planet nodo2) {
        this.nodo2 = nodo2;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Route(){

    }

    @Override
    public String toString() {
        return nodo1.getName() + " -- " + peso + " -->" + nodo2.getName();
    }
    
    
    
    
}
