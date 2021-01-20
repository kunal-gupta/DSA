import com.nisum.MagicSquareCostCalculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * This class write the test code to verify if magic squre is returning correct value or not.
 */
public class MagicSquareCostCalculatorTest {
    @Test
    public void testFindMinimumCost(){
        MagicSquareCostCalculator magicSquareCostCalculator = new MagicSquareCostCalculator();

        int [][]matrix = {
                {5, 3, 4},
                {1, 5, 8},
                {6, 4, 2}
        };

        int cost = magicSquareCostCalculator.findMinimumCost(matrix);
        //assert statement
        assertEquals(cost, 7);
    }
}
