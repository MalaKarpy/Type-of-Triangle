import org.junit.*;
import static org.junit.Assert.*;

public class RectangleUnitTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    TriangleTracker testTriangle = new TriangleTracker(2, 2, 2);
    assertEquals(true, testTriangle instanceof TriangleTracker);
  }

  @Test
  public void isEquilateral() {
    TriangleTracker testTriangle = new TriangleTracker(2, 2, 2);
    assertEquals("Equilateral", testTriangle.typeOfTriangle());
  }
 }
