
public class Student {
	String name;
	int age;
	String grade;
	
	public Student() {
		name = "Unknown ";
		age = 0;
		grade = "Not Assigned";
		assignGrade();
		displayStudentDetails();
	}
	public Student(String passedName, int passedAge, String passedGrade) {
		name = passedName;
		age = passedAge;
		grade = passedGrade;
		assignGrade();
		displayStudentDetails();
	}
	
	public void displayStudentDetails() {
		System.out.println(" Name: " + name + "\n Age: " + age + "\n Grade: " + grade);
		System.out.println("-------------------");
		
	}
	
	public void assignGrade() {
		if (age < 18) {
			grade = "Freshmen";
		} else if  (age > 18 && age < 22) {
				grade = "Sophmore";
			} else {
				grade = "Senior";
		}
	}
		
		
	
}
