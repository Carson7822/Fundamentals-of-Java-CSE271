
public class Triangle implements Comparable<Triangle>{
    
    Double firstSide;
    
    Double secondSide;
    
    Double thirdSide;
    
    Double largestSide;
    
    Double middleSide;
    
    Double smallestSide;
    
    public Triangle(Double passedFirstSide, Double passedSecondSide, Double passedThirdSide) {
        firstSide = passedFirstSide;
        
        secondSide = passedSecondSide;
        
        thirdSide = passedThirdSide;
        
        sortSides();
       
    }
    
    
    public void sortSides() {
        largestSide = Math.max(firstSide, Math.max(secondSide, thirdSide));
        
        smallestSide = Math.min(firstSide, Math.min(secondSide, thirdSide));
        
        middleSide = firstSide + secondSide + thirdSide - (largestSide + smallestSide);
          
    }
    
    public Double areaCalc() {
        
        Double p = (smallestSide + middleSide + largestSide);
        p = p / 2;
        
        Double area = p * (p - largestSide) * (p - middleSide) * (p - smallestSide);
        
        area = Math.sqrt(area);
        
        return area;
    }
    
    public int compareTo(Triangle passedTriangle) {
        
        int largestComparison = largestSide.compareTo(passedTriangle.largestSide);
        
        if (largestComparison != 0) {
            
            return largestComparison;
            
        }
        
        int middleComparison = middleSide.compareTo(passedTriangle.middleSide);
        
        if (middleComparison != 0 ) {
            
            return middleComparison;
        }
        
        int smallestComparison = smallestSide.compareTo(passedTriangle.smallestSide);
        
        if (smallestComparison != 0) {
            return smallestComparison;
        }
        
        return areaCalc().compareTo(passedTriangle.areaCalc());
        
    }

}
