package coding.exercise;

public class Operation {

    String operator;
    Float value;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Operation(String operator, Float value) {
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String toString() {
        return operator + " " + value;
    }
}
