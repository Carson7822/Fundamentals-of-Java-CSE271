
class Triangle implements Comparable<Triangle>{
    
    private Double firstSide;
    
    private Double secondSide;
    
    private Double thirdSide;
    
    private Double largestSide;
    
    private Double middleSide;
    
    private Double smallestSide;
    
    Triangle(Double passedFirstSide, Double passedSecondSide, Double passedThirdSide) {
        
        firstSide = passedFirstSide;
        
        secondSide = passedSecondSide;
        
        thirdSide = passedThirdSide;
        
        sortSides();
    }
    
    private void sortSides() {
        
        largestSide = Math.max(firstSide, Math.max(secondSide, thirdSide));
        
        smallestSide = Math.min(firstSide, Math.min(secondSide, thirdSide));
        
        middleSide = firstSide + secondSide + thirdSide - (largestSide + smallestSide);
    }
    
    private Double area() {
        
        Double p = (firstSide + secondSide + thirdSide);
        
        p = p / 2;
        
        Double area = p * (p - firstSide) * (p - secondSide) * (p - thirdSide);
        
        area = Math.sqrt(area);
        
        return area;
    }
    
    public int compareTo(Triangle passedTriangle) {
        
        int largestCompare = largestSide.compareTo(passedTriangle.largestSide);
        
        if (largestCompare != 0) {
            
            return largestCompare;
        }
        
        int middleCompare = middleSide.compareTo(passedTriangle.middleSide);
        
        if (middleCompare != 0) {
            
            return middleCompare;
        }
        
        int smallestCompare = smallestSide.compareTo(passedTriangle.smallestSide);
        
        if (smallestCompare != 0) {
            
            return smallestCompare;
        }
        
        return area().compareTo(passedTriangle.area());
    }
    
}