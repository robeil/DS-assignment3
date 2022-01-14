package DS_assignment3;

import java.util.Arrays;

public class StudentArray<E> {

    private Student[] a;
    private int nElems;

    //constructor
    public StudentArray(int max) {
        nElems = 0;
        a = new Student[max];
    }

    //Finding student using Id
    public Student find(int id) {
        //creating  temporary student
        Student found = null;
        //loop through the array to find the student by id
        for (int i = 0; i < nElems; i++) {
            if (a[i].getId() == id)
                found = a[i];
        }
        //return the found Student
        return found;
    }

    //put student into array at last
    public void insert(int id, String name, int mark){
        //creating student object
    Student students = new Student(id,name,mark);
    //checking if the id exist then add
    if(find(id) == null){
             a[nElems] = students;
               nElems++;
           } else{
               System.out.println("Id exist, It cannot be added");
           }
       }

    //Delete student from the array
    public boolean delete(int id){
    //checking if the id exist then delete
        Student temp = null;
       for(int i = 0; i < nElems; i++){
           if(a[i].getId() == id){
              temp = a[i];
           }

            //shifting the element
            for (int j = id +1; j < nElems; j++) {
                a[j-1] = a[j];
            }
        }
            nElems--;
        return true;
    }

    //Displays array contents
    public void displayAll(){

        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i]);
        }
    }

    @Override
    public String toString() {
        return "StudentArray{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }
}