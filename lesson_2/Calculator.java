
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
        int result = 0;

        switch (this.operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum -secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '^':
                result = 1;
                for (int i = 0; i <= secondNum; i++) {
                    result *= firstNum;
                }
                break;
            case '%':
                result =firstNum % secondNum;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }
}
