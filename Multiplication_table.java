import java.util.Scanner;
class MutiplicationTable
{   
public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num =input.nextInt();
        for (int i=0;i<10;i++)
            {
                System.out.println((i + 1)+" x "+num+" = "+(num * (i + 1)));  
            }
    }
}
