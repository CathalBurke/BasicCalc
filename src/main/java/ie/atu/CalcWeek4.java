package ie.atu;

import java.util.Scanner;
public class CalcWeek4 {
    public static void main(String[] args) {

        Scanner Scan1= new Scanner(System.in);

        System.out.println("Please enter  a number");
        double FirstNum=Scan1.nextDouble();
        System.out.println("you entered " + FirstNum);

        System.out.println("Please enter a second number");
        double SecondNum=Scan1.nextDouble();
        System.out.println("you entered " + SecondNum);

        System.out.println("please enter an operation (add,subtract,multiply,divide,exponential)");
        String operation= Scan1.next();

        switch (operation) {

            case "add":
                add(FirstNum,SecondNum);
                break;

            case "subtract":
                subtract(FirstNum,SecondNum);
                break;

            case "multiply":
                multiply(FirstNum,SecondNum);
                break;
            case "divide":
                divide(FirstNum,SecondNum);
                break;

            case "exponential":
                exponential(FirstNum, SecondNum);
                break;



            default:  System.out.println("invalid operation");
            break;


        }

    }

public static void add(double Firstnum, double Secondnum){
    double result = Firstnum + Secondnum;
    System.out.println("the result is " +result );

}

public static void subtract(double Firstnum, double Secondnum){
        double result = Firstnum-Secondnum;
        System.out.println("the result is " +result );
}

public static void multiply(double Firstnum, double Secondnum){
        double result = Firstnum * Secondnum;
        System.out.println("the result is " +result );
}

    public static void divide(double FirstNum, double SecondNum) {
        if (SecondNum != 0) {
            double result = FirstNum / SecondNum;
            System.out.println("The result is " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
    public static void exponential(double FirstNum, double SecondNum) {
      double result= Math.pow(FirstNum, SecondNum);
      System.out.println(FirstNum +  "      raised to the power of      " + SecondNum     +result);


    }






}





