package DS_assignment3;

import java.util.Arrays;

public class arrayTest {

    public static void main(String[] args) {

        generateInteger number = new generateInteger();

        number.insert();
        number.removeDuplicates();
        System.out.println("Updated number " + number.set(3,11));
        System.out.println("The subList array" + Arrays.toString(number.subList(2,25)));
        System.out.println("The current size " +number.size());
        System.out.println("Given index hold this number " + number.get(0));
        number.clear();
    }
}
