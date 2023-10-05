import design1.PointCP;
import design2.PointCP2;
import design3.PointCP3;
import design5.PointCP5;
import design5.PointCP5_2;
import design5.PointCP5_3;


public class Main {

    public static void main(String[] args) 
    {
        double randomNum = Math.random();
        PointCP point1 = new PointCP('C', randomNum, randomNum); 
        PointCP2 point2 = new PointCP2(randomNum, randomNum); 
        PointCP3 point3 = new PointCP3(randomNum, randomNum);
        PointCP5 point5_2 = new PointCP5_2('C',randomNum, randomNum);
        PointCP5 point5_3 = new PointCP5_3('P',randomNum, randomNum);        

        System.out.println("Design 1");
        tests.test1(point1);
        System.out.println("DESIGN 2 ");
        tests.test2(point2);
        System.out.println("DESIGN 3 ");
        tests.test3(point3);
        System.out.println("DESIGN 5_2 ");
        tests.test5(point5_2);
        System.out.println("DESIGN 5_3 ");
        tests.test5(point5_3);

        System.out.println("DESIGN 1 POLAR ");
        PointCP point1_p2 = new PointCP('P',randomNum, randomNum); 
        tests.test1(point1_p2);
    }
}
