public class Operation {
    public static double calc(double firstNum, String operator, double secondNum){
        return switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "%" -> firstNum % secondNum;
            case "/" -> firstNum / secondNum;
            default -> {
                System.out.println("The operator you enter is invalid ");
                yield 0;
            }
        };
    }
}
