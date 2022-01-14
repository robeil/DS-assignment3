package DS_assignment3;

import java.util.Arrays;
import java.util.Random;

public class generateInteger {

    //private static final int INITIAL_CAPACITY = 50;
    private int[] arr;
    private int size = 50;
    private int capacity;

    //constructor
    public generateInteger() {
        arr = new int[size];
    }

    // a) Inset method to fill the random numbers from 0 - 100;
    public void insert(){
        //Random API that generate random number
        Random random = new Random();
        int randomNum;
        //loop that inset 50 radnom numbers
        for(int i = 0; i < 50; i++){
         randomNum = (int) (Math.random()*100);
         arr[i] = randomNum;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Original Array length is "+ arr.length);
    }

    // b) Remove duplicated number from the array
    public void removeDuplicates(){
        int count = 0;
        //checking every element if they are the same
        for(int i = 1; i < arr.length; i++){
         for(int j = 0; j < i; j++ ) {
             if (arr[i] == arr[j]){
                 count++;
                 break;
             }
         }
     }
    //getting the actual length of the none-duplicated numbers from the loop
     int newArrLength = arr.length - count;
     int[] newArr = new int[newArrLength];

     newArr[0] = arr[0];
     int index = 1;
    //separating the duplicated number and store the none-duplicated to the new array
     for(int i = 1; i  < arr.length; i++){
         boolean isDuplicate = false;
         for(int j = 0; j < i; j++){
             if(arr[i] == arr[j]){
                 isDuplicate = true;
             }
         }
         //storing the not duplicated number from the original to the new array
         if(!isDuplicate){
             newArr[index++] = arr[i];
         }
         size = newArrLength;
         // arr = newArr;
     }

     System.out.println(Arrays.toString(newArr));
     System.out.println("New array length is " + newArr.length);

    }
    // c) Remove all the elements from the array
    public void clear(){
        int length = arr.length;
        //looping the array and turning the element value to 0
        for(int i = 0; i < length; i++){
            if(arr.length > 0){
                arr[i] = 0;
           }
           length = 0;
        }

        size = length;
        System.out.println("Length of the array after removeAll " + size);
    }
    // d) find the size of  the array
    public int size(){
        return size;
    }

    // e) Getting the value by index
    public int get(int index){
        //validating the given parameter
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
            //retrieving the value by index  and return
            return arr[index];
    }

    // f) Getting the subList by passing the start and end index
    public int[] subList(int start, int end){
        //validating the user input
        if(start < 0 || end >= size)
            throw new ArrayIndexOutOfBoundsException();

        //Creating sliced array according the given parameter
        int[] slicedArray = new int[end - start];

        //storing the sliced array to the newly created array
        for(int i = 0; i <slicedArray.length; i++){
            slicedArray[i] = arr[start + i];
        }
        //returning the sliced array
        return slicedArray;
    }

    // g) Updating the new value using index
    public int set(int index, int newValue){

        //validating the user input
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        //Holding the old value before change
        int oldValue = arr[index];
        //Updating the given index value
        arr[index] = newValue;

        return oldValue;
    }

}
