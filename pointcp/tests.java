import java.util.ArrayList;

import design1.PointCP;
import design2.PointCP2;
import design3.PointCP3;
import design5.PointCP5;


public class tests {
    public static ArrayList<Float> test1(PointCP point) {
        float start;
        float end;

        start = System.nanoTime(); // Millis gives the answer of zero

        for (int i=0; i <120000000; i++) 
        {
            point.getY();
        }
        end = System.nanoTime();
        System.out.print("Design 1 get Coord test: " + (end - start) + " ns \n");


        start = System.nanoTime();
        for (int i=0; i <120000000; i++) 
        {
            point.getRho();
        }
        end = System.nanoTime();
        System.out.print("Design 1 get Polar test: " + (end - start) + " ns \n");

        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.getDistance(point);
        }
        end = System.nanoTime();
        System.out.print("Design 1 get Distance test: " + (end - start) + " ns \n");
    
        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.rotatePoint(i);
        }
        end = System.nanoTime();
        System.out.print("Design 1 Rotate test: " + (end - start) + " ns \n");

        return null;
        
    }

    public static ArrayList<Float> test2(PointCP2 point) {
        float start;
        float end;

        start = System.nanoTime();

        for (int i=0; i <120000000; i++) 
        {
            point.getY();
        }
        end = System.nanoTime();
        System.out.print("Design 2 get Coord test: " + (end - start) + " ns \n");


        start = System.nanoTime();
        for (int i=0; i <120000000; i++) 
        {
            point.getRho();
        }
        end = System.nanoTime();
        System.out.print("Design 2 get Polar test: " + (end - start) + " ns \n");

        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.getDistance(point);
        }
        end = System.nanoTime();
        System.out.print("Design 2 get Distance test: " + (end - start) + " ns \n");
    
        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.rotatePoint(i);
        }
        end = System.nanoTime();
        System.out.print("Design 2 Rotate test: " + (end - start) + " ns \n");

        return null;
        
    }
    public static ArrayList<Float> test3(PointCP3 point) {
        float start;
        float end;

        start = System.nanoTime();

        for (int i=0; i <120000000; i++) 
        {
            point.getY();
        }
        end = System.nanoTime();
        System.out.print("Design 3 get Coord test: " + (end - start) + " ns \n");


        start = System.nanoTime();
        for (int i=0; i <110000000; i++) 
        {
            point.getRho();
        }
        end = System.nanoTime();
        System.out.print("Design 3 get Polar test: " + (end - start) + " ns \n");

        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.getDistance(point);
        }
        end = System.nanoTime();
        System.out.print("Design 3 get Distance test: " + (end - start) + " ns \n");
    
        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.rotatePoint(i);
        }
        end = System.nanoTime();
        System.out.print("Design 3 Rotate test: " + (end - start) + " ns \n");
        
        return null;
        
    }
    
    public static ArrayList<Float> test5(PointCP5 point) {
        float start;
        float end;

        start = System.nanoTime();

        for (int i=0; i <120000000; i++) 
        {
            point.getY();
        }
        end = System.nanoTime();
        System.out.print("Design 5 get Coord test: " + (end - start) + " ns \n");


        start = System.nanoTime();
        for (int i=0; i <120000000; i++) 
        {
            point.getRho();
        }
        end = System.nanoTime();
        System.out.print("Design 5 get Polar test: " + (end - start) + " ns \n");

        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.getDistance(point);
        }
        end =  System.nanoTime();
        System.out.print("Design 5 get Distance test: " + (end - start) + " ns \n");
    
        start = System.nanoTime();
        for (int i=0; i < 120000000; i++) 
        {
            point.rotatePoint(i);
        }
        end = System.nanoTime();
        System.out.print("Design 5 Rotate test: " + (end - start) + " ns \n");

        return null;
        
    }
    
}


