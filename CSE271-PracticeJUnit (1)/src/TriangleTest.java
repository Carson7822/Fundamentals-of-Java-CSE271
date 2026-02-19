import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
    
    Triangle triangleObject = new Triangle(3.0, 4.0, 5.0);

    @Test
    public void testScenario1() {
        
        assertTrue(triangleObject.area() == 6);
    }

}
