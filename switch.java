import java.util.Scanner;
public class switch
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter num1");
     int num1=sc.nextInt();
     System.out.println("Enetr num2");
     int num2=sc.nextInt();
     
     switch(data)
     {
        case1:"+";
        System.out.println(num1+num2);
        break;
        case2:"-";
        System.out.println(num1-num2);
        break;
        case3:"*";
        System.out.println(num1*num2);
        break;
        case4:"/";
        System.out.println(num1/num2);
        break;
        default:
        System.out.println("invalid status");
        break;
     }
    }
}