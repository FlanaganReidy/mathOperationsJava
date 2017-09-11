package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Operand one:");
        String userInput = scanner.nextLine();
        Double operand1 = Double.parseDouble(userInput);
        Double operand2;
        do {
            System.out.println("Enter Operand two:");
            userInput = scanner.nextLine();
            operand2 = Double.parseDouble(userInput);
        }while(operand2 == 0);

        double sum = operand1+operand2;
        double multiplication = operand1*operand2;
        double division = operand1/operand2;
        double difference = operand1 - operand2;
        double remainder = operand1%operand2;

        showResults(sum,multiplication,division,difference,remainder);



    }
    public static void showResults(double sum, double multiplication, double division, double difference, double remainder){
        System.out.println("The sum of operands is: " + sum);
        System.out.println("The difference of operand one minus operand two is:" + difference);
        System.out.println("The product of the operands is: " + multiplication);
        System.out.println("The quotient of operand one by operand two is: " + division);
        System.out.println("The remainder of operand one divided by operand two is: " + remainder);
    }
}
