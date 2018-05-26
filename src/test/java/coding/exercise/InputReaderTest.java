package coding.exercise;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


public class InputReaderTest {
    private InputReader inputReader = new InputReader();

    @Test
    public void shouldReadAddOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test1");
        Assert.assertEquals("+", addOperation.get(0).operator);
    }

    @Test
    public void shouldReadNumberAtAddOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test1");
        Float expected = 2.0f;
        Assert.assertEquals(expected, addOperation.get(0).value);
    }

    @Test
    public void shouldReadMultiplyOperation() throws IOException {
        List<Operation> multiplyOperation = inputReader.readFromFile("test2");
        Assert.assertEquals("*", multiplyOperation.get(0).operator);
    }

    @Test
    public void shouldReadNumberAtMultiplyOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test2");
        Float expected = 3.0f;
        Assert.assertEquals(expected, addOperation.get(0).value);
    }

    @Test
    public void shouldReadSubstractOperation() throws IOException {
        List<Operation> substractOperation = inputReader.readFromFile("test3");
        Assert.assertEquals("-", substractOperation.get(0).operator);
    }

    @Test
    public void shouldReadNumberSubstractOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test3");
        Float expected = 2.0f;
        Assert.assertEquals(expected, addOperation.get(0).value);
    }

    @Test
    public void shouldReadDivideOperation() throws IOException {
        List<Operation> divideOperation = inputReader.readFromFile("test4");
        Assert.assertEquals("/", divideOperation.get(0).operator);
    }

    @Test
    public void shouldReadNumberAtDivideOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test4");
        Float expected = 3.0f;
        Assert.assertEquals(expected, addOperation.get(0).value);
    }

    @Test
    public void shouldReadApplyOperation() throws IOException {
        List<Operation> divideOperation = inputReader.readFromFile("test5");
        Assert.assertEquals("", divideOperation.get(0).operator);
    }

    @Test
    public void shouldReadNumberAtApplyOperation() throws IOException {
        List<Operation> addOperation = inputReader.readFromFile("test5");
        Float expected = 10.0f;
        Assert.assertEquals(expected, addOperation.get(0).value);
    }

}
