package coding.exercise;

import java.util.List;

public class ResultCalculator {

    public static Float calculate(List<Operation> operationList) {
        Operation lastElement = operationList.get(operationList.size()-1);
        Float inputValue = lastElement.getValue();

        for (Operation operation : operationList){
            if(operation.operator.equals("+")){
                inputValue += operation.value;
            }
            else if (operation.operator.equals("*")){
                inputValue *= operation.value;
            }
            else if (operation.operator.equals("/")){
                inputValue /= operation.value;
            }
            else if (operation.operator.equals("-")){
                inputValue -= operation.value;


            }
        }
        return inputValue;
    }
}
