public class methodoverload
{
    
        int add(int a,int b)
        {
            return a+b;
        }
        int add(int a,int b,int c)
        {
            return a+b+c;
        }
    public static void main(String[] args)
    {
        methodoverload mo=new methodoverload();
        
        System.out.println(mo.add(10,20));
        System.out.println(mo.add(20,10,12));
}
}