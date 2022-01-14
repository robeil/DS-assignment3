package DS_assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class marketingTest {

    public static void main(String[] args) {

        //creating marketing array
        ArrayList<Marketing> marketList = new ArrayList();
        //creating marketing object
        marketList.add(new Marketing("Merhawi","ProApp",3625));
        marketList.add(new Marketing("Robeil","BestApp",2514));
        marketList.add(new Marketing("Yonas","SubProApp",5412));
        marketList.add(new Marketing("Mera","App",2525));
        marketList.add(new Marketing("Robi","Best",1414));
        marketList.add(new Marketing("Yoni","SubPro",4712));

        //deleting object by index
        marketList.remove(marketList.remove(2));

        //updating or modifying an object FIXME =>---------->???
        //  marketList.set(0,marketList.set(0,));
        for(Marketing m: marketList){
            System.out.println(m.getEmployeeName());
        }
        //get the size of the array
        System.out.println("Size of the array is " + marketList.size());
        //calculating the total sales-amount
        double totalSale = 0.0;
        for(Marketing ms: marketList){
           totalSale += ms.getSalesAmount();
           System.out.println("Total sales are " + totalSale);
         }
        //using get method //FIXME =>------> ???
        for(int i = 0; i < 1; i++){
            System.out.println(marketList.get(0).getEmployeeName());
           //FIXME =>--------->??????????????
        }
        //using clear method
        marketList.clear();
        System.out.println("Size of the array is after clearing " + marketList.size());



    }
}
