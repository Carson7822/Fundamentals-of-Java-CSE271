
public class Sample {
	int instanceVariable; 
	
	double doubleInstanceVariable;
	
	
	
	public void method1() {
		System.out.println("you are calling method1.");
	}
	public void method2(int passedInt) {
		System.out.println("You have passed this value: " + passedInt);
	}
	
	public boolean method3(int passedInt) {
		
		return passedInt % 2 == 0;
	}
}
