package com.company;

public class Main {
    //      HOMEWORK:  create method that checks two numbers and uses a switch to return max, min
    public static void main(String[] args) {

        int firstValue = 15;
        int secondValue = 90;
        int answer = 0;

        String operator = ">";
        switch (operator) {
            case ">":
                answer = Math.max(firstValue, secondValue);
                System.out.println("Max is: " + answer);
            case "<":
                answer = Math.min(firstValue, secondValue);
                System.out.println("Min is: " + answer);

        }
    }

//    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
//        double answer;
//        answer = 0;
//        switch (operator) {
//            case "+":
//                answer = firstNumber + secondNumber;
//                return answer;
//            case "-":
//                answer = firstNumber - secondNumber;
//                return answer;
//            case "*":
//                answer = firstNumber * secondNumber;
//                return answer;
//            case "/":
//                answer = firstNumber / secondNumber;
//                return answer;
//            default:
//                System.out.println("Enter valid operator ");
//                break;
//        }
//        return answer;
//    }

}

