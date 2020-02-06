
public class Calculator {

    private int firstNum;
    private int secondNum;
    private char operator;

    public int getFirstNum() {
        return this.firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return this.secondNum;
    }
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getOperator() {
        return this.operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int calculate() {

        switch (operator) {
            case '+':
                return firstNum + secondNum;
            case '-' :
                return firstNum -secondNum;
            case '*' :
                return firstNum * secondNum;
            case '/':
                return firstNum / secondNum;
            case '^':
                int result = 1;
                for (int i = 0; i <= secondNum; i++) {
                    result *= firstNum;
                }
                return result;
            case '%':
                return firstNum % secondNum;
            default:
                System.out.println("Недопустимый знак математической операции");
                return 0;
        }
    }
}
