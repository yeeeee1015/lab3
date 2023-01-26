import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithInts() {
    int[] input1 = { 1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceWithInts() {
    int[] input1 = { 1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1 }, input1);
  }

  @Test
  public void testAverageLessThan2() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageInts(){
    double[] input1 = {1.2, 1.2, 1.3, 1.4, 1.5};
    assertEquals(1.35, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}


