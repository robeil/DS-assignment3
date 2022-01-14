package DS_assignment3;

public class studentTest {

    public static void main(String[] args) {

        StudentArray<Student> studentArray = new StudentArray<>(10);

        studentArray.insert(2,"Robeil",25);
        studentArray.insert(1,"Yonas",15);
        studentArray.insert(3,"Merhawi",05);
        studentArray.insert(4,"Keleab",12);

        System.out.println("-------------");
        studentArray.displayAll();
        System.out.println("-------------");
        System.out.println("Found by ID "+studentArray.find(1));
        System.out.println("Deleted : "+ studentArray.delete(3) + " FIXME ??????????"); //FIXME ------>
        System.out.println("-------------");
        studentArray.displayAll();
        System.out.println("-------------");


    }
}
