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
        boolean isDeleted = false;

       for(int i = 0; i < nElems; i++){
           if(a[i].getId() == id){
              temp = a[i];
              //isDeleted = true;
           }

            //shifting the element
            for (int j = i +1; j < nElems; j++) {
                a[j-1] = a[j];
                isDeleted = true;
            }
        }
            nElems--;
        return isDeleted;
    }

    //Displays array contents
    public void displayAll(){

        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i]);
        }
    }
   // finding Student with maximum mark
    public Student maxMark(){
        Student maxStu = a[0];

        for(int i = 0; i < nElems; i++){
            if(a[i].getMark() > maxStu.getMark()){
               maxStu = a[i];
            }
        }
        return maxStu;
    }

    //finding Student with minimum mark
    public Student minMark(){
        Student minStu = a[0];

        for(int i = 0; i < nElems; i++){
            if(a[i].getMark() < minStu.getMark()) {
                minStu = a[i];
            }
        }
        return minStu;

    }

    @Override
    public String toString() {
        return "StudentArray{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }
}