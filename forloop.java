public class forloop
{
    public static void main(String args[])
    {
        int n=10;
        myCode(n);
    }
    private static void myCode(int n)
    {
            for(int i=0;i<=n;i++)
            {
                if(i%2==0)
                System.out.println(i);
            }
    }
}