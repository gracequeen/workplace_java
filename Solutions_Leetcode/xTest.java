/* This is a test template for leetcode solution classes
 * using JUnit
 * one can copy all into the test file and modify accordingly
 * Reference URL: http://junit.org/javadoc/latest/index.html
 * Compile Test: javac x.java xTest.java
 * Run Test: java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore xTest
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class xTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}