package code_part2;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class part2b {
    private Random random;
    public int arrayListSize;

    public part2b() {
        random = new Random();
    }

    public void createArrayList() {

        long start = System.currentTimeMillis();
        long targetTime = start + 5000; // 5 seconds in milliseconds

        List<Integer> integerList = new ArrayList<>(); // create empty array list

        while (System.currentTimeMillis() < targetTime) { // add many integers form 0-9 for 10 seconds
            integerList.add(random.nextInt(10)); // add random integres from 0-9
        }

        arrayListSize = integerList.size(); // store the size of the array
        long end = System.currentTimeMillis(); // store endtime
        long elapsedTime = end - start; // calculate elapsed time

        System.out
                .println(integerList.size() + " integers were added in " + elapsedTime + " milliseconds - ArrayList.");

        long startTimeIterator = System.currentTimeMillis();
        int sum = 0;
        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
            sum = sum + iterator.next();
        }

        long endTimeIterator = System.currentTimeMillis();
        long elapsedTimeIterator = endTimeIterator - startTimeIterator;

        System.out.println("- Array List -");
        System.out.println("Added and Iterated through: " + integerList.size() + " integers" + "\n"
                + " Time To Create Array:" + elapsedTime + "ms \n" + "Sum is: " + sum + "\n" + "Time to Sum: "
                + elapsedTimeIterator + " milliseconds");
    }

    public void createVector(int sizeArray) {

        long start = System.currentTimeMillis();

        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < sizeArray; i++) {
            vector.add(random.nextInt(10));
        }

        long end = System.currentTimeMillis();
        long arrTime = end - start;

        long startTimeIterator = System.currentTimeMillis();
        int sum = 0;
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            sum = sum + iterator.next();
        }
        long endTimeIterator = System.currentTimeMillis();
        long timeToSum = endTimeIterator - startTimeIterator;
        ;

        System.out.println("- Vector Array -");
        System.out.println("Added and Iterated through: " + vector.size() + " integers" + "\n" + " Time To Create Array:"
                + arrTime + "ms \n" + "Sum is: " +
                +sum + "\n" + "Time to Sum: " + timeToSum + " milliseconds");
    }

    public void createArray(int size) {

        long start = System.currentTimeMillis();
        int sum = 0;

        int[] arr = new int[size]; // create an array that has the same size as the arrayList

        for (int i = 0; i < size; i++) { // add random numbers ranging from 0-9
            arr[i] = random.nextInt(10);
        }

        long end = System.currentTimeMillis(); // store endtime
        long arrTime = end - start; // calculate elapsed time

        long startTimeIterator = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        long endTimeIterator = System.currentTimeMillis();
        long timeToSum = endTimeIterator - startTimeIterator;

        System.out.println("- Normal Array -");
        System.out.println("Added and Iterated through: " + arr.length + " integers" + "\n" + " Time To Create Array:"
                + arrTime + "ms \n" + "Sum is: " +
                +sum + "\n" + "Time to Sum: " + timeToSum + " milliseconds");
    }

    public static void main(String[] args) {
        part2b instance = new part2b(); // creates instance of part2
        instance.createArrayList(); // creates large Array List

        int size = instance.arrayListSize; // saves Array List size

        System.out.println("\n");

        part2b vector = new part2b(); // makes instance of part2 again for the vector
        vector.createVector(size); // uses size of ArrayList to construct vector

        System.out.println("\n");

        part2b normalArray = new part2b(); // makes another instance for the normal array
        normalArray.createArray(size); // uses the size of the ArrayList to contruct the normal array
    }
}