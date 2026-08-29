import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Double> myGradesArrayList = new ArrayList<Double>();
		
		myGradesArrayList.add(83.7);
		myGradesArrayList.add(87.3);
		myGradesArrayList.add(92.1);
		myGradesArrayList.add(93.1);
		myGradesArrayList.add(83.7);
		myGradesArrayList.add(88.4);
		myGradesArrayList.add(89.1);
		
		
		myGradesArrayList.add(2,95.6);
		
		
		System.out.println("Size(): " + myGradesArrayList.size());
		System.out.println(myGradesArrayList);
		
		System.out.println("Element number 2 is: " + myGradesArrayList.get(2));
		
		myGradesArrayList.remove(93.1);
		
		myGradesArrayList.remove(3);
		
		
		myGradesArrayList.set(2, 85.9);
		System.out.println("Now element number 2 is: " + myGradesArrayList.get(2));
		System.out.println(myGradesArrayList);
		
		myGradesArrayList.remove(83.7);
		System.out.println("Does the list contain 83.7? The answer is: " + myGradesArrayList.contains(83.7));
		
		ArrayList<Double> secondGradesArrayList = new ArrayList<Double>();
		
		secondGradesArrayList.add(75.2);
		secondGradesArrayList.add(83.7);
		
		myGradesArrayList.addAll(secondGradesArrayList);
		System.out.println(myGradesArrayList);
		
		ArrayList<Double> thirdGradesArrayList = new ArrayList<Double>();
		
		thirdGradesArrayList.add(78.6);
		thirdGradesArrayList.add(83.7);
		
		myGradesArrayList.removeAll(thirdGradesArrayList);
		
		System.out.println(myGradesArrayList);
		
		myGradesArrayList.clear();
		
		System.out.println("Is the list empty after being cleared? The answer is: " + myGradesArrayList.isEmpty());
		
		System.out.println("Size(): " + myGradesArrayList.size());
	}

}
