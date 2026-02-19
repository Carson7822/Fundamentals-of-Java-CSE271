import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Integer integerObject = 10;
		
		System.out.println(integerObject);
		
		int intVariable = 6;
		
		integerObject = intVariable;
		
		int intVariable2 = integerObject;
		
		
		
		ArrayList<String> studentArrayList = new ArrayList<String>();
		
		System.out.println(studentArrayList.isEmpty());
		
		
		System.out.println(studentArrayList.size());
		
		
		studentArrayList.add("Behrouz");
		
		System.out.println(studentArrayList.isEmpty());
		
		
		System.out.println(studentArrayList.size());
		
		System.out.println(studentArrayList);
		
		studentArrayList.add("John");
		
		System.out.println(studentArrayList);
		
		
		studentArrayList.add("Eric");
	
		System.out.println(studentArrayList);
		
		studentArrayList.add(1,"Cynthia");
		
		System.out.println(studentArrayList);
		
		studentArrayList.add("Behrouz");
		
		
		studentArrayList.add("Kaylin");
		
		System.out.println(studentArrayList);
		
		studentArrayList.remove("John");
		
		System.out.println(studentArrayList);
		
		studentArrayList.remove("Behrouz");
	
		System.out.println(studentArrayList);
		
		studentArrayList.remove(1);
		
		System.out.println(studentArrayList);
		
		System.out.println(studentArrayList.get(1));
		
		
		studentArrayList.set(1, "Max");
		
		System.out.println(studentArrayList);
		
		System.out.println(studentArrayList.contains("Behrouz"));
		
		ArrayList<String> secondStudentArrayList = new ArrayList<String>();
		
		secondStudentArrayList.add("Behrouz");
		
		secondStudentArrayList.add("Meisam");
		
		
		
		studentArrayList.addAll(secondStudentArrayList);
		
		System.out.println(studentArrayList);
		
		ArrayList<String> ThirdStudentArrayList = new ArrayList<String>();
		
		ThirdStudentArrayList.add("Max");
		
		ThirdStudentArrayList.add("Meisam");
		
		studentArrayList.removeAll(ThirdStudentArrayList);
		
		System.out.println(studentArrayList);
		
		studentArrayList.clear();

		System.out.println(studentArrayList.isEmpty());
		
		
		System.out.println(studentArrayList.size());
		
		ArrayList<Character> CharacterArrayList = new ArrayList<Character>();
		
		CharacterArrayList.add('B');
		
		CharacterArrayList.add('Z');
		
		System.out.println(CharacterArrayList);
	}

}
