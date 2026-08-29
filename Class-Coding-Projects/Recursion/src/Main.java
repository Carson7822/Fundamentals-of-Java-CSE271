
public class Main {

    public static String printPermutations(String permutedPart, String nonPermutedPart) {
        if (nonPermutedPart.length() == 0) {
            return permutedPart;
        }
        
        return method(passedInt - 1) + method(passedInt - 2);
    }    
    
    public static void main(String[] args) {
        String s = "ABCDEF";
        System.out.println(s.substring(0,2));
    }

}

