import java.util.Scanner;


public class Application {
    public static void main(String[] args)
    {
        int input_1, input_2, Final_Output=0;
        char Input_Choice;
        Scanner Scan = new Scanner(System.in);
        input_1= Scan.nextInt();
        input_2= Scan.nextInt();

        Calculator Calc = new Calculator();
        System.out.println("Enter Your Choice ( +, -, *, /)");
        Input_Choice = Scan.next().charAt(0);

        switch (Input_Choice)
        {
            case '+':
                Final_Output = Calc.sum(input_1,input_2);
                System.out.println(Final_Output);
                break;

            case '-':
                Final_Output = Calc.difference(input_1,input_2);
                System.out.println(Final_Output);
                break;

            case '*':
                Final_Output = Calc.product(input_1,input_2);
                System.out.println(Final_Output);
                break;

            case '/':
                Final_Output = Calc.divide(input_1,input_2);
                System.out.println(Final_Output);
                break;

            default:
                System.out.printf("Please enter the correct operator!!!");
        }
    }
}