import java.util.Scanner;
public class array
{
    public static void main(String args[])
    {
                int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arrya elemnts");
        
      for(int i=1;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("Array Elemnts");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
