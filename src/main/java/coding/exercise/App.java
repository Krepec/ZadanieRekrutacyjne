package coding.exercise;

import java.io.IOException;
import java.util.List;

public class App {


    public static void main(String[] args) throws IOException {
        String path = "/home/krzysztof/Downloads/codingexercise/src/main/resources/numbers";
        InputReader read = new InputReader();


        List<Operation> operationList =  read.readFromFile(path);

        Float result = ResultCalculator.calculate(operationList);
        System.out.println("Result is " + result);


    }


}
