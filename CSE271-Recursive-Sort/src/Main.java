import java.lang.reflect.Array;

public class Main {
    
    public static void printArray(int[] passedArray) {
        
        System.out.print("[");
        
        for (int i = 0; i <= passedArray.length - 2; i++) {
            
            System.out.print(passedArray[i] + ", ");
        }
        
        if (passedArray.length != 0) {
            
            System.out.print(passedArray[passedArray.length -1]);
        }
        
        System.out.println("]");
    }
    
    public static int[] subArray(int[] passedArray, int leftIndex, int rightIndex) {
        
        int[] toBeReturned = new int[rightIndex - leftIndex + 1];
        
        for (int i = leftIndex; i <= rightIndex; i++) {
            
            toBeReturned[i - leftIndex] = passedArray[i];
        }
        
        return toBeReturned;
    }
    
    public static int[] mergeSortedArrays(int[] passedArray1, int[] passedArray2, boolean ascendingNotDescending) {
        
        int i = 0;
        
        int j = 0;
        
        int k = 0;
        
        int[] toBeReturned = new int[passedArray1.length + passedArray2.length];
        
        while(i <= passedArray1.length - 1 && j <= passedArray2.length - 1) {
            
            if((passedArray1[i] < passedArray2[j] && ascendingNotDescending) || (passedArray1[i] > passedArray2[j] && !ascendingNotDescending)) {
                
             toBeReturned[k] = passedArray1[i];
             
             i++;
             
            } else {
                
                toBeReturned[k] = passedArray2[j];
                
               j++;
            }
            
            k++;
        }
        
        while(i <= passedArray1.length - 1){
            
            toBeReturned[k] = passedArray1[i];
            
            i++;
            
            k++;
        }
            
        while(j <= passedArray2.length - 1){
            
            toBeReturned[k] = passedArray2[j];
            
            j++;
            
            k++;
        }
        
        return toBeReturned;    
    }
    
    public static int[] mergeSort(int[] array, boolean ascendingNotDescending) {
        
        if (array.length <= 1) {
            
            return subArray(array,0,array.length -1);
        }
        
        int middleIndex = array.length / 2;
        
        return mergeSortedArrays(mergeSort(subArray(array,0,middleIndex - 1),
                ascendingNotDescending),mergeSort(subArray(array,middleIndex, array.length - 1), ascendingNotDescending),ascendingNotDescending);
    }
    


    public static void main(String[] args) {
        
        int[] array1 = {4, 10, 11, 25};
        
        int[] array2 = {5, 6, 12, 27, 30, 31};
        
        int[] array = {7,18,21,2,5,4,23,11,17};
        
        //printArray(mergeSortedArrays(array1,array2,true));
        
        printArray(mergeSort(array,true));
        
        printArray(mergeSort(array,false));
        

        
    }

}
