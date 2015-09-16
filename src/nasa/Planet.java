
package nasa;

import java.util.ArrayList;


public class Planet {

    private String name;
    private int XCoordinate;
    private int YCoordinate;
    private ArrayList <Planet> neighbors = new ArrayList();
    boolean isVisited = false;
    
    public Planet(String name, int XCoordinate, int YCoordinate) {
        this.name = name;
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }

    public String getName() {
        return name;
    }
    
    public int getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(int XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    public int getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }
    
    public void addNeighbor(Planet a){
        neighbors.add(a);
    }
    
    public ArrayList <Planet> getNeighbors(){
        return neighbors;
    }
    
    public boolean isVisited(){
        return isVisited;
    }
    
    public void setVisited(){
        isVisited = true;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
    
    
    
    
   
}
