import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        Student firstObject = new Student("Alice", 20, 3.8);
        Student secondObject = new Student("Bob", 21, 3.8);
        Student thirdObject = new Student("Charlie", 22, 3.8);
        Student fourthObject = new Student("Charlie", 20, 3.5);
        Student fifthObject = new Student("Emma", 19, 3.5);
        
        studentArrayList.add(firstObject);
        studentArrayList.add(secondObject);
        studentArrayList.add(thirdObject);
        studentArrayList.add(fourthObject);
        studentArrayList.add(fifthObject);
        
        
        System.out.println("Before sorting:");
        
        for (int i = 0; i < studentArrayList.size(); i++) {
            
            System.out.println(studentArrayList.get(i));
        }
        
        Collections.sort(studentArrayList);
        
        System.out.println("");
        System.out.println("After sorting:");
        
        for (int i = 0; i < studentArrayList.size(); i++) {
            
            System.out.println(studentArrayList.get(i));
        }
    }

}
