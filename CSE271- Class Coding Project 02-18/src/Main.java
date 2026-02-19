
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("------------------------------");

        printFibonacci(10, '|');
    }

    public static void printFibonacci(int passedInt, char passedDelimitter) {
        int[] fibonacci = new int[passedInt];

        fibonacci[1] = 1;

        for (int i = 2; i <= passedInt - 1; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }

        printArray(fibonacci, passedDelimitter);

    }

    public static void printArray(int[] passedArray, char passedDelimitter) {
        for (int i = 0; i <= passedArray.length - 1; i++) {
            System.out.print(passedArray[i] + passedDelimitter);
        }
    }

}
