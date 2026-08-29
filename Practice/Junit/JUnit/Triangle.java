
public class Triangle {
    
    double firstSide;
    
    double secondSide;
    
    double thirdSide;
    
    Triangle(double passedFirstSide, double passedSecondSide, double passedThirdSide) {
        
        firstSide = passedFirstSide;
        
        secondSide = passedSecondSide;
        
        thirdSide = passedThirdSide;
        
    }
    
    public double perimeter() {
        
        return firstSide + secondSide + thirdSide;
    }
    
    public double area() {
        
        double semiPerimeter = (firstSide + secondSide + thirdSide)/2;
        
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * 
                (semiPerimeter - thirdSide));
        }

}
