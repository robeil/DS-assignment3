package DS_assignment3;

import java.util.ArrayList;

import java.util.List;

public class marketingTest {

    public static void main(String[] args) {

        //creating marketing array
        List<Marketing> marketList = new ArrayList<>();

        //creating marketing object
        marketList.add(new Marketing("Merhawi","ProApp",3625));
        marketList.add(new Marketing("Robeil","BestApp",2514));
        marketList.add(new Marketing("Yonas","SubProApp",5412));

        //get the size of the array
        System.out.println("Size of the array is " + marketList.size());

        System.out.println("-------------");
        //  marketList.set(0,marketList.set(0,));
        for(Marketing m: marketList){
            System.out.println(m.getEmployeeName());
        }

        System.out.println("-------------");
        //calculating the total sales-amount
        double totalSale = 0.0;
        for(Marketing ms: marketList){
           totalSale += ms.getSalesAmount();
           System.out.println("Total sales are " + totalSale);
         }

        //deleting object by index
        marketList.remove(marketList.remove(2));

        System.out.println("-------------");
        System.out.println("After removing one object");
        for(Marketing m: marketList){
            System.out.println(m.getEmployeeName());
        }

        System.out.println("-------------");
        System.out.println("after updating one element");
        //updating or modifying an object
        marketList.set(1,new Marketing("Samuel","NON",9857));
        for(Marketing m: marketList){
            System.out.println(m.getEmployeeName());
        }

        System.out.println("-------------");
        System.out.println("Getting one element");

        //using get method
        for(int i = 0; i < 1; i++){
            System.out.println(marketList.get(0).getEmployeeName());
        }

        System.out.println("-------------");
        //using clear method
        marketList.clear();
        System.out.println("Size of the array is after clearing " + marketList.size());

    }
}
