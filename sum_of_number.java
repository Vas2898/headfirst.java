import java.util.Scanner;
class SumOfTwoNumber
{
public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = input.nextInt();
        System.out.println("Enter First Number : ");
        int number2 = input.nextInt(); 
        SumOfTwoNumber sum = new SumOfTwoNumber();
        sum.add(number1, number2);
        
    }
    void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
}
