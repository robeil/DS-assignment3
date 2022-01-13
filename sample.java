package DS_assignment3;

import java.util.Arrays;
import java.util.Random;

public class sample {

    private static final int INITIAL_CAPACITY = 50;
    private int[] arr;
    private int size = 0;
    private int capacity;

    public sample() {
        capacity = INITIAL_CAPACITY;
        arr = new int[capacity];
    }
    ///Inset method to fill the random numbers from 0 - 100;
    public void insert(){
        Random random = new Random();
        int randomNum;

        for(int i = 0; i < 50; i++){
            randomNum = (int) (Math.random()*100);
            arr[i] = randomNum;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Array length is "+ arr.length);
    }
}