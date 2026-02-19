
public class main {

	public static void main(String[] args) {
		
		Sample sampleClassObject = new Sample();
		
		sampleClassObject.instanceVariable = 12;
		
		System.out.println("intInstanceVariable = " + sampleClassObject.instanceVariable);
		
		sampleClassObject.doubleInstanceVariable = 1.2;
		
		System.out.println("intInstanceVariable = " + sampleClassObject.doubleInstanceVariable);
		
		sampleClassObject.method1();
		
		sampleClassObject.method2(15);
		
		System.out.println("Is 17 an even number? The answer is: " + sampleClassObject.method3(17));
	
		

	}

}
