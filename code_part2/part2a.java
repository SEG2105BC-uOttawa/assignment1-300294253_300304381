package code_part2;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class part2a {
    private Random randomNumberGenerator;
    public int sizeOfArrayList; 

    public part2a() {
        randomNumberGenerator = new Random();
    }

    public void createArrayList() {

        long startTimeMillis = System.currentTimeMillis();
        long targetTimeMillis = startTimeMillis + 5000; // 5 seconds in milliseconds as 10 seconds created heap problems
        List<Integer> integerList = new ArrayList<>(); 

        while (System.currentTimeMillis() < targetTimeMillis) { 

            integerList.add(randomNumberGenerator.nextInt(10)); // add random integers from 0-9

        }
        sizeOfArrayList = integerList.size(); 
        long endTimeMillis = System.currentTimeMillis(); 
        long elapsedTimeMillis = endTimeMillis - startTimeMillis; 
        System.out.println(integerList.size() + " integers were added in " + elapsedTimeMillis + " milliseconds - ArrayList.");
    }

    public void createArray(int sizeOfArray) {
        long startTimeMillis = System.currentTimeMillis();
        int[] intArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) { // add random numbers 0-9
            intArray[i] = randomNumberGenerator.nextInt(10);
        }

        long endTimeMillis = System.currentTimeMillis(); 
        long elapsedTimeMillis = endTimeMillis - startTimeMillis; 
        
        System.out.println(intArray.length + " integers were added in " + elapsedTimeMillis + " milliseconds - Normal Array.");

    }

    public void createVector(int sizeOfArray) {

        long startTimeMillis = System.currentTimeMillis();
        Vector<Integer> vectorNew = new Vector<>();

        for (int i = 0; i < sizeOfArray; i++) { // add random number from 0-9
            vectorNew.add(randomNumberGenerator.nextInt(10));
        }

        long endTimeMillis = System.currentTimeMillis(); 
        long elapsedTimeInMillis = endTimeMillis - startTimeMillis; 

        System.out.println(vectorNew.size() + " integers were added in " + elapsedTimeInMillis + " milliseconds - Vector.");
    }

    public static void main(String[] args) {
        part2a instance = new part2a(); // creates an instance of part 2a
        instance.createArrayList(); // creates a large ArrayList

        int size = instance.sizeOfArrayList; // saves the ArrayList size

        part2a normalArr = new part2a(); // makes an instance for the normal array
        normalArr.createArray(size); // uses the size of the ArrayList to construct the normal array

        part2a vector = new part2a(); // makes an instance for vectory array
        vector.createVector(size); // uses size for vector array construction
    }
}
