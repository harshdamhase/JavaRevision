import java.util.Scanner;
public class sample
{
      public static void main(String args[])
      {
            int a[]=new int[5];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array elemnt");

            for(int i=0;i<a.length;i++)
            {
                  a[i]=sc.nextInt();
                  
            }
            System.out.println("array elemnts are");
            for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            }

      }
}