import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTestCase {
    
    Triangle refrenceTriangle = new Triangle(3.0, 4.0, 5.0);
    
    Triangle permutedTriangle1 = new Triangle(3.0, 5.0, 4.0);
    
    Triangle permutedTriangle2 = new Triangle(4.0, 3.0, 5.0);
    
    Triangle permutedTriangle3 = new Triangle(4.0, 5.0, 3.0);
    
    Triangle permutedTriangle4 = new Triangle(5.0, 3.0, 4.0);
    
    Triangle permutedTriangle5 = new Triangle(5.0, 4.0, 3.0);
    
    Triangle smallerFirstSideTriangle = new Triangle(2.0, 4.0, 5.0);
    
    Triangle largerFirstSideTriangle = new Triangle(4.0, 4.0, 5.0);
    
    Triangle smallerSecondSideTriangle = new Triangle(3.0, 3.0, 5.0);
     
    Triangle largerSecondSideTriangle = new Triangle(3.0, 5.0, 5.0);
    
    Triangle smallerThirdSideTriangle = new Triangle(3.0, 4.0, 4.0);
    
    Triangle largerThirdSideTriangle = new Triangle(3.0, 4.0, 6.0);


    @Test
    void testScneraio1() {
        assertTrue(permutedTriangle1.compareTo(refrenceTriangle) == 0);
    }
   
    @Test
    void testScneraio2() {
        assertTrue(permutedTriangle2.compareTo(refrenceTriangle) == 0);
    }
    
    
    @Test
    void testScneraio3() {
        assertTrue(permutedTriangle3.compareTo(refrenceTriangle) == 0);
    }
    
    @Test
    void testScneraio4() {
        assertTrue(permutedTriangle4.compareTo(refrenceTriangle) == 0);
    }
    
    @Test
    void testScneraio5() {
        assertTrue(permutedTriangle5.compareTo(refrenceTriangle) == 0);
    }
    
    @Test
    void testScneraio6() {
        assertTrue(smallerFirstSideTriangle.compareTo(refrenceTriangle) < 0);
    }
    
    @Test
    void testScneraio7() {
        assertTrue(largerFirstSideTriangle.compareTo(refrenceTriangle) > 0);
    }
    
    @Test
    void testScneraio8() {
        assertTrue(smallerSecondSideTriangle.compareTo(refrenceTriangle) < 0);
    }
    
    @Test
    void testScneraio9() {
        assertTrue(largerSecondSideTriangle.compareTo(refrenceTriangle) > 0);
    }
    
    @Test
    void testScneraio10() {
        assertTrue(smallerThirdSideTriangle.compareTo(refrenceTriangle) < 0);
    }
    
    @Test
    void testScneraio11() {
        assertTrue(largerThirdSideTriangle.compareTo(refrenceTriangle) > 0);
    }






}
