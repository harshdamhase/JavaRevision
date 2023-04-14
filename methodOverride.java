public class methodOverride
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add1(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        methodOverride ov=new methodOverride();
        System.out.println(ov.add(10,20));
        System.out.println(ov.add1(2,3));
    }
}