
public class Student implements Comparable<Student>{
    
    String name;
    
    int age;
    
    Double GPA;
    
    Student(String passedName, int passedAge, Double passedGPA) {
        
        name = passedName;
        
        age = passedAge;
        
        GPA = passedGPA;
    }
    

    
    public int compareTo(Student passedStudent) {
        
        if (GPA.doubleValue() != passedStudent.GPA) {
            
            return GPA.compareTo(passedStudent.GPA);
        }
        
        if (age != passedStudent.age) {
            
            return Integer.compare(age,  passedStudent.age);
        }
        

        return name.compareTo(passedStudent.name);
        
    }
    
    
    public String toString() {
        
        return "Name: " + name + ", Age: " + age + ", GPA: " + GPA;

    }

}
