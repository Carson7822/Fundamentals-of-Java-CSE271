
public class Main {

    public static void main(String[] args) {
        int intVariable = 4 + 6;

        int[] array1 = new int[intVariable];
        method2(array1);
        method3(array1);

        System.out.println("---------------------------------------------");

    }

    public static void method1() {
        System.out.println("                                     Hello  " 
                + "                             ");

    }

    public static void method2(int[] passedArray) {
        for (int i = 0; i <= passedArray.length - 1; i = i + 1) {

            System.out.print(passedArray[i]);

        }
    }

    public static void method3(int[] arrayParameter) {

        for (int j = 0; j <= arrayParameter.length - 1; j++) {
            System.out.print("                      " 
                    + arrayParameter[arrayParameter.length - 1 - j] + "|");
        }
    }

}
