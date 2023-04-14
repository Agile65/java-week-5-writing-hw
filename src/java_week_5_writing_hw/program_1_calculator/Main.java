package java_week_5_writing_hw.program_1_calculator;

import java_week_5_writing_hw.program_1_calculator.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner scanner=new Scanner(System.in);
        String answer;
        do{
            System.out.println("Please Enter first Number : ");//input wizard
            int a=scanner.nextInt();
            System.out.println("Please Enter second Number : ");//input wizard
            int b=scanner.nextInt();
            System.out.println("Please enter one symbol :");//input wizard
            char symbol=scanner.next().charAt(0);
            Calculator calculator=new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation please enter 'Y' or 'N' : ");//input wizard
            answer=scanner.next().toLowerCase(Locale.ROOT);
        }
        while(answer.startsWith("y"));
        //Closing a scanner object
        scanner.close();
    }
}
