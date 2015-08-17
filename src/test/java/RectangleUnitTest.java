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

  @Test
  public void isIsosceles() {
    TriangleTracker testTriangle = new TriangleTracker(2, 4, 4);
    assertEquals("Isoscelene", testTriangle.typeOfTriangle());
  }

  @Test
  public void isScalene() {
    TriangleTracker testTriangle = new TriangleTracker(7, 4, 5);
    assertEquals("Scalene", testTriangle.typeOfTriangle());
  }
 }
