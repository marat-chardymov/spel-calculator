import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.example.SpelCalculator;

import static org.testng.Assert.assertEquals;

/**
 * Created by Marat_Chardymau on 7/7/2015.
 */
@ContextConfiguration(locations = "/context.xml")
public class SpelTestCase
  extends AbstractTestNGSpringContextTests
{

  @Autowired
  private SpelCalculator spelCalculator;

  @Test
  public void addition()
  {
    Double result = spelCalculator.calculate("2+2");
    assertEquals(result, 4.0);
  }

  @Test
  public void subtraction()
  {
    double result = spelCalculator.calculate("12-9");
    assertEquals(result, 3.0);
  }

  @Test
  public void multiplication()
  {
    double result = spelCalculator.calculate("3*3");
    assertEquals(result, 9.0);
  }

  @Test
  public void division()
  {
    double result = spelCalculator.calculate("12/3");
    assertEquals(result, 4.0);
  }
}
