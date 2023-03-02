public class elseifstat
{
    public static void main(String[] args)
    {
        int num1=10;
        int num2=30;
        int num3=29;

        if(num1>num2 && num1>num3)
        System.out.println("num1 is gereater");
        else if(num2>num1 && num2>num3)
        System.out.println("num2 is greater");
        else
        System.out.println("num3 is greater");
    }
}