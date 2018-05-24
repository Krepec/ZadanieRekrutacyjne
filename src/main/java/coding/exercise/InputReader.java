package coding.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    public List<Operation> readFromFile(String path) throws IOException {
        String text;
        List<Operation> operations = new ArrayList<Operation>();

        InputStreamReader fileReader = new InputStreamReader(this.getClass().getResourceAsStream("/" + path));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((text = bufferedReader.readLine()) != null) {
            String[] array = text.split(" ");

            if (array[0].equals("add")) {
                operations.add(new Operation("+", Float.valueOf(array[1])));

            } else if (array[0].equals("multiply")) {
                operations.add(new Operation("*", Float.valueOf(array[1])));

            } else if (array[0].equals("divide")) {
                if(!array[1].equals("0")) {
                    operations.add(new Operation("/", Float.valueOf(array[1])));
                }
                else {
                    throw new IllegalStateException("Cannot divide by zero");
                }

            } else if (array[0].equals("substract")) {
                operations.add(new Operation("-", Float.valueOf(array[1])));

            } else if (array[0].equals("apply")) {
                operations.add(new Operation("", Float.valueOf(array[1])));
            }
        }

        return operations;
    }
}

