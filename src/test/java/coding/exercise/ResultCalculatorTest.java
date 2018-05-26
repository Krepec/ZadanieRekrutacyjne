package coding.exercise;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ResultCalculatorTest {
    private InputReader inputReader = new InputReader();



    @Test
    public void shouldCalculateResult() throws IOException {
        List<Operation> inputDataFromFile = inputReader.readFromFile("test6");
        Float result = ResultCalculator.calculate(inputDataFromFile);
        Float expected = 12.333333f;
        Assert.assertEquals(expected, result);

    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExeptionWhenDivideByZero() throws IOException, IllegalStateException {
        List<Operation> inputDataFromFile = inputReader.readFromFile("test7");
        Float result = ResultCalculator.calculate(inputDataFromFile);
        //expected value here isn't important because test testing divide by zero
        Float expected = 1f;
        Assert.assertEquals(expected, result);
    }


}
