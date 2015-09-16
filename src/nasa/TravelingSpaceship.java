
package nasa;

import static java.lang.StrictMath.abs;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TravelingSpaceship extends Thread{
    
    private Map map;
    private int run;
    private int rise;
    
    public TravelingSpaceship(String msg){
        super(msg);
    }
    
    public TravelingSpaceship(Map map){
        this.map = map;
    }
    
    @Override
    public void run(){
        ArrayList <Route> allRoutes = map.grafo.getRoutes();
        int CX1 = map.spaceship.getX();
        int CY1 = map.spaceship.getY();
        
        int CX2 = map.planetDest.getXCoordinate();
        int CY2 = map.planetDest.getYCoordinate();
        
        
        run = abs(CX2-CX1);
        rise = abs(CY2-CY1);
        
        if(run == 0)
            run = 1;
        
        reduceToLowestTerms();
        
        System.out.println("run: " + run + "   rise" + rise);
        System.out.println("spaceshipX = " + CX1);
        System.out.println("spaceshipY = " + CY1);
        System.out.println("PlanetX = " + CX2);
        System.out.println("Planety = " + CY2);
        
        
        if(CX1 == CX2 && CY1 < CY2){
            System.out.println("Vertical up");
            for(int i = CY1; i < CY2+10; i+=10){
                map.spaceship.setLocation(CX1,i);
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        
        else if(CX1 == CX2 && CY2 < CY1){
            System.out.println("Vertical down");
             for(int i = CY1; i > CY2; i-=10){
                map.spaceship.setLocation(CX1,i);
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        
        else if(CY1 == CY2 && CX1 < CX2){
            System.out.println("Horizontal right");
            for(int i = CX1; i < CX2; i+=10){
                map.spaceship.setLocation(i,CY1);
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        
        else if(CY1 == CY2 && CX2 < CX1){
            System.out.println("Horizontal left");
            for(int i = CX1; i > CX2; i-=10){
                map.spaceship.setLocation(i,CY2);
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        
        else if(CX1 < CX2 && CY1 < CY2){
            System.out.println("Diagonal [x,-y]");
            boolean flag = true;
            while(CX1 < CX2 && CY1 < CY2){
                if(flag == true){
                    map.spaceship.setLocation(CX1+run,CY1);
                    CX1+=run;
                    flag = false;
                }
                else{
                    map.spaceship.setLocation(CX1,CY1+rise);
                    CY1+=rise;
                    flag = true;
                }
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        else if(CX1 > CX2 && CY1 < CY2){
            System.out.println("Diagonal [-x,-y]");
            boolean flag = true;
            while(CX1 > CX2 && CY1 < CY2){
                if(flag == true){
                    map.spaceship.setLocation(CX1-run,CY1);
                   CX1-=run;
                    flag = false;
                }
                else{
                    map.spaceship.setLocation(CX1,CY1+rise);
                    CY1+=rise;
                    flag = true;
                }
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        else if(CX1 < CX2 && CY1 > CY2){
            System.out.println("Diagonal [x,y]");
           boolean flag = true;
            while(CX1 < CX2 && CY1 > CY2){
                if(flag == true){
                    map.spaceship.setLocation(CX1+run,CY1);
                    CX1+=run;
                    flag = false;
                }
                else{
                    map.spaceship.setLocation(CX1,CY1-rise);
                    CY1-=rise;
                    flag = true;
                }
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        else if(CX1 > CX2 && CY1 > CY2){
            System.out.println("Diagonal [-x,y]");
            boolean flag = true;
            while(CX1 > CX2 && CY1 > CY2){
                if(flag == true){
                    map.spaceship.setLocation(CX1-run,CY1);
                    CX1-=run;
                    flag = false;
                }
                else{
                    map.spaceship.setLocation(CX1,CY1-rise);
                    CY1-=rise;
                    flag = true;
                }
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TravelingSpaceship.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.printLines(); 
            }
        }
        map.spaceship.setLocation(map.planetDest.getXCoordinate(),map.planetDest.getYCoordinate());
        map.printLines();      
    }
    
    public void reduceToLowestTerms() {
    Integer gcd = this.greatestCommonDivisor(rise, run);
    if (gcd < 0) {
      gcd = -gcd;
    }
    rise = rise/gcd;
    run = run/gcd;
  }

  private Integer greatestCommonDivisor(Integer a, Integer b) {
    if ((a % b) == 0) {
      return b;
    }
    else {
      return greatestCommonDivisor(b, a % b);
    }
  }

}
